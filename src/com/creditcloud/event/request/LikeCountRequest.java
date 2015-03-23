package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 众筹项目的点赞总数
 * 
 * @author mengxc
 *
 */
public class LikeCountRequest extends ApiRequest {

	public LikeCountRequest(String projectId) {
		super(String.format(ApiConstants.API_LIKECOUNT, projectId));
	}	
}
