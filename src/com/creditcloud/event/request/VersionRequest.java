package com.creditcloud.event.request;

import com.creditcloud.api.ApiSettings;
import com.creditcloud.event.ApiRequest;

/**
 * 获取版本信息
 *  
 * @author mengxc
 *
 */
public class VersionRequest extends ApiRequest {

	public VersionRequest() {
		super(ApiSettings.API_VERSION);
	}

	public VersionRequest(String api) {
	    super(api);
	}
}
