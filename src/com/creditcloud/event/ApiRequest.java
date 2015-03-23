package com.creditcloud.event;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.Request.Method;
import com.creditcloud.api.ApiSettings;
import com.creditcloud.utils.StringUtils;

public class ApiRequest{
	
	public  String url = "";
	
	private int method;
	
	protected Map<String,Object> params = null;
	
	public ApiRequest(String values){
		this.url = String.format("%1$s%2$s", ApiSettings.URL_BASE, values);
		this.params = new HashMap<String, Object>();
	}

	public String getUrl(int method) {
		switch (method){
		case Method.GET:
			return url;
		case Method.POST:
			return StringUtils.urlWithParameters(url, params);
		}
		return url;
	}


}
