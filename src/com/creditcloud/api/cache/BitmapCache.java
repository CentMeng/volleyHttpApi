package com.creditcloud.api.cache;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader.ImageCache;
import com.creditcloud.utils.StringUtils;

public class BitmapCache implements ImageCache{

	private LruCache<String, Bitmap> memoryCache;
	
	private DiskLruCache diskCache;
	
	public BitmapCache(DiskLruCache diskCache, LruCache<String, Bitmap> memoryCache){
		this.memoryCache = memoryCache;
		this.diskCache = diskCache;
	}
	
	
	@Override
	public Bitmap getBitmap(String url) {
		// TODO Auto-generated method stub
		String key = StringUtils.getMD5(url);
		if(memoryCache.get(key) != null){
			return memoryCache.get(key);
		}else{
		DiskLruCache.Snapshot snapshot = null;
		try {
			snapshot = diskCache.get(key);
			if(snapshot != null){
				InputStream is = snapshot.getInputStream(0);
				return BitmapFactory.decodeStream(is);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		}
		return null;
	}

	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		// TODO Auto-generated method stub
		String key = StringUtils.getMD5(url);
		memoryCache.put(key, bitmap);
		try {
			DiskLruCache.Editor editor = diskCache.edit(key);
			OutputStream outputStream = editor.newOutputStream(0);
			if(bitmap.compress(DiskCacheParams.COMPRESSFORMAT, DiskCacheParams.QUALITY, outputStream)){
				editor.commit();
			}else{
				editor.abort();
			}
			diskCache.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
