package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取当前项目喜爱总数
 * 
 * @author mengxc
 *
 */
public class FavoriteCountRequest extends ApiRequest {

	public FavoriteCountRequest(String projectId) {
		super(ApiConstants.API_FAVORITE_COUNT);
	}
}
