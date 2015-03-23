package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取众筹回报
 * 
 * @author mengxc
 *
 */
public class ProjectRewardsRequest extends ApiRequest {

	public ProjectRewardsRequest(String projectId) {
		super(String.format(ApiConstants.API_REWARDS, projectId));
	}
	
}

