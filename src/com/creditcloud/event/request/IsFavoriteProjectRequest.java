package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 检测当前众筹是否加过喜爱
 * 
 * @author mengxc
 *
 */
public class IsFavoriteProjectRequest extends ApiRequest {

	public IsFavoriteProjectRequest(String projectId) {
		super(ApiConstants.API_ISFAVORITE);
	}
	
}

