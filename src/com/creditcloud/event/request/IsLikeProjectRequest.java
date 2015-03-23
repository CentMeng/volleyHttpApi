package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 是否对当前众筹点过赞
 * 
 * @author mengxc
 *
 */
public class IsLikeProjectRequest extends ApiRequest {

	public IsLikeProjectRequest(String projectId) {
		super(String.format(ApiConstants.API_ISLIKE, projectId));
	}	
}
