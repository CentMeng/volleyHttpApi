package com.creditcloud.api.cache;

import android.graphics.Bitmap.CompressFormat;


/**
 * DiskLruCache 的配置文件
 * @author mengxc （csdn@vip.163.com）
 *
 */
public class DiskCacheParams {

	public final static String DIR = "thumb";
	
	public final static int DEFAULT_DISKCACHE_SIZE = 10 * 1024 * 1024;

	public final static CompressFormat COMPRESSFORMAT = CompressFormat.JPEG ;
	
	public final static int QUALITY = 100;
			
}
