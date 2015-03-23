package com.creditcloud.api;

import java.util.HashMap;
import java.util.Map;

import android.util.Base64;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.GsonRequest;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.creditcloud.api.cache.BitmapCache;
import com.creditcloud.utils.NetWorkUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class VolleyHttpClient {

	private static boolean DEBUG = false;

	private static final String TAG = "VolleyHttpClient";

	private static HttpService httpService;
	private final static Gson gson = new Gson();

	/**
	 * 选用哪一种资金托管模式（联动、汇付）
	 * 
	 * @param thirdParty
	 *            PAYMENT_VENDOR_UMP/PAYMENT_VENDOR_CHINAPNR
	 * @return
	 */
	public VolleyHttpClient thirdPart(int thirdParty) {
		if (thirdParty == ApiConstants.PAYMENT_VENDOR_UMP) {
			ApiSettings.URL_THIRD_PARTY_PAYMENT = ApiConstants.URL_THIRD_PARTY_UMP;
			ApiSettings.PAYMENT_VENDOR = thirdParty;
		} else if (thirdParty == ApiConstants.PAYMENT_VENDOR_CHINAPNR) {
			if (DEBUG) {
				ApiSettings.URL_THIRD_PARTY_PAYMENT = ApiConstants.URL_THIRD_PARTY_PNR_DEBUG;
			} else {
				ApiSettings.URL_THIRD_PARTY_PAYMENT = ApiConstants.URL_THIRD_PARTY_PNR;
			}
			ApiSettings.PAYMENT_VENDOR = thirdParty;
		}
		return this;
	}

	public VolleyHttpClient version(String version) {
		ApiSettings.API_VERSION = version;
		return this;
	}

	public VolleyHttpClient enableLog(boolean enableLog) {
		DEBUG = enableLog;
		return this;
	}

	public VolleyHttpClient(HttpService httpService) {

		this.httpService = httpService;
	}

	/**
	 * 传入初始化好的httpService 实例
	 * 
	 * @param httpService
	 * @return
	 */
	public static VolleyHttpClient newInstance(HttpService httpService,
			String url, String clientId, String clientSecret) {
		ApiSettings.URL_BASE = url;
		ApiSettings.CLIENT_ID = clientId;
		ApiSettings.CLIENT_SECRET = clientSecret;
		if (httpService != null) {
			return new VolleyHttpClient(httpService);
		}
		return null;
	}

	public void get(String url, Class clazz, Response.Listener listener,
			Response.ErrorListener errorListener) {

		GsonRequest request = new GsonRequest(Request.Method.GET, url, clazz,
				null, null, listener, errorListener);

		HttpService.httpQueue.getCache().invalidate(url, true);
		if (!NetWorkUtils.detect(httpService.getContext())) {

			if (HttpService.httpQueue.getCache().get(url) != null) {
				String cacheStr = new String(HttpService.httpQueue.getCache()
						.get(url).data);

				if (cacheStr != null) {

					try {

						listener.onResponse(gson.fromJson(cacheStr, clazz));

					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}

					return;
				}

			}

			return;

		}

		httpService.addToRequestQueue(request);

	}

	public static void getStatic(String url, Class clazz,
			Response.Listener listener, Response.ErrorListener errorListener,
			String[] keys, String[] values) {

		getWithHeaderStatic(url, clazz, null, listener, errorListener, keys,
				values);

	}

	public static void getWithHeaderStatic(String url, Class clazz,
			Map<String, String> header, Response.Listener listener,
			Response.ErrorListener errorListener, String[] keys, String[] values) {

		Map<String, String> params = new HashMap<String, String>();
		for (int i = 0; i < keys.length; i++) {
			params.put(keys[i], values[i]);
		}

		GsonRequest request = new GsonRequest(Request.Method.GET, url, clazz,
				header, params, listener, errorListener);

		HttpService.httpQueue.getCache().invalidate(url, true);
		if (!NetWorkUtils.detect(httpService.getContext())) {

			if (HttpService.httpQueue.getCache().get(url) != null) {
				String cacheStr = new String(HttpService.httpQueue.getCache()
						.get(url).data);

				if (cacheStr != null) {

					try {

						listener.onResponse(gson.fromJson(cacheStr, clazz));

					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}

					return;
				}

			}

			return;

		}

		httpService.addToRequestQueue(request);
	}

	/**
	 * 
	 * @param url
	 * @param clazz
	 * @param header
	 * @param listener
	 * @param errorListener
	 * @param keys
	 * @param values
	 */
	public void getWithHeader(String url, Class clazz,
			Map<String, String> header, Response.Listener listener,
			Response.ErrorListener errorListener, String[] keys, String[] values) {

		Map<String, String> params = new HashMap<String, String>();
		for (int i = 0; i < keys.length; i++) {
			params.put(keys[i], values[i]);
		}

		GsonRequest request = new GsonRequest(Request.Method.GET, url, clazz,
				header, params, listener, errorListener);

		HttpService.httpQueue.getCache().invalidate(url, true);
		if (!NetWorkUtils.detect(httpService.getContext())) {

			if (HttpService.httpQueue.getCache().get(url) != null) {
				String cacheStr = new String(HttpService.httpQueue.getCache()
						.get(url).data);

				if (cacheStr != null) {

					try {

						listener.onResponse(gson.fromJson(cacheStr, clazz));

					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}

					return;
				}

			}

			return;

		}
		httpService.addToRequestQueue(request);
	}

	/**
	 * 
	 * @param url
	 * @param clazz
	 * @param listener
	 * @param errorListener
	 * @param keys
	 * @param values
	 */
	public void getWithParams(String url, Class clazz,
			Response.Listener listener, Response.ErrorListener errorListener,
			String[] keys, String[] values) {

		Map<String, String> params = new HashMap<String, String>();
		for (int i = 0; i < keys.length; i++) {
			params.put(keys[i], values[i]);
		}

		GsonRequest request = new GsonRequest(Request.Method.GET, url, clazz,
				null, params, listener, errorListener);

		HttpService.httpQueue.getCache().invalidate(url, true);
		if (!NetWorkUtils.detect(httpService.getContext())) {

			if (HttpService.httpQueue.getCache().get(url) != null) {
				String cacheStr = new String(HttpService.httpQueue.getCache()
						.get(url).data);

				if (cacheStr != null) {

					try {

						listener.onResponse(gson.fromJson(cacheStr, clazz));

					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}

					return;
				}

			}

			return;

		}
		httpService.addToRequestQueue(request);
	}

	public void getTokenOauth(String url, Class clazz,
			Response.Listener listener, Response.ErrorListener errorListener) {

		Map<String, String> header = new HashMap<String, String>();

		String accessToken = "";
		header.put("Authorization", "Bearer" + " " + accessToken);
		GsonRequest request = new GsonRequest(Request.Method.GET, url, clazz,
				header, null, listener, errorListener);

		HttpService.httpQueue.getCache().invalidate(url, true);
		if (!NetWorkUtils.detect(httpService.getContext())) {

			if (HttpService.httpQueue.getCache().get(url) != null) {
				String cacheStr = new String(HttpService.httpQueue.getCache()
						.get(url).data);

				if (cacheStr != null) {

					try {

						listener.onResponse(gson.fromJson(cacheStr, clazz));

					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}

					return;
				}

			}

			return;

		}
		httpService.addToRequestQueue(request);
	}

	/**
	 * 
	 * @param url
	 * @param clazz
	 * @param listener
	 * @param errorListener
	 */
	public void post(String url, Class clazz, Response.Listener listener,
			Response.ErrorListener errorListener) {

		postWithHeader(url, clazz, null, listener, errorListener);

	}

	/**
	 * 
	 * @param url
	 * @param clazz
	 * @param params
	 * @param listener
	 * @param errorListener
	 */
	public void postWithParams(String url, Class clazz,
			Map<String, String> params, Response.Listener listener,
			Response.ErrorListener errorListener) {

		GsonRequest request = new GsonRequest(Request.Method.POST, url, clazz,
				null, params, listener, errorListener);

		httpService.addToRequestQueue(request);
	}

	public void postWithHeader(String url, Class clazz,
			Map<String, String> header, Response.Listener listener,
			Response.ErrorListener errorListener) {

		GsonRequest request = new GsonRequest(Request.Method.POST, url, clazz,
				header, null, listener, errorListener);

		httpService.addToRequestQueue(request);
	}

	public void postOAuth(String url, Class clazz, Response.Listener listener,
			Response.ErrorListener errorListener) {

		Map<String, String> header = new HashMap<String, String>();

		// replace your token
		String accessToken = "";
		header.put("Authorization", "Bearer" + " " + accessToken);
		postWithHeader(url, clazz, header, listener, errorListener);

	}

	public void postOAuthWithParams(String url, Class clazz,
			Map<String, String> params, Response.Listener listener,
			Response.ErrorListener errorListener) {

		Map<String, String> header = new HashMap<String, String>();
		header.put(
				"Authorization",
				"Basic"
						+ " "
						+ Base64.encodeToString(
								(ApiSettings.CLIENT_ID + ":" + ApiSettings.CLIENT_SECRET)
										.getBytes(), Base64.NO_WRAP));

		GsonRequest request = new GsonRequest(Request.Method.POST, url, clazz,
				header, params, listener, errorListener);

		httpService.addToRequestQueue(request);

	}

	public void postOAuthWithTokenParams(String url, Class clazz,
			Map<String, String> params, Response.Listener listener,
			Response.ErrorListener errorListener) {

		Map<String, String> header = new HashMap<String, String>();
		String accessToken = "";
		header.put("Authorization", "Bearer" + " " + accessToken);
		GsonRequest request = new GsonRequest(Request.Method.POST, url, clazz,
				header, params, listener, errorListener);

		httpService.addToRequestQueue(request);

	}

	/**
	 * 图片请求
	 */
	public void loadingImage(ImageView imageView, String url, int loadingResid,
			int errorResid, BitmapCache mCache) {
		ImageListener listener = ImageLoader.getImageListener(imageView,
				loadingResid, errorResid);
		if (httpService.httpQueue != null) {
			ImageLoader imageLoader = new ImageLoader(httpService.httpQueue,
					mCache);
			imageLoader.get(url, listener);
		}
	}

}
