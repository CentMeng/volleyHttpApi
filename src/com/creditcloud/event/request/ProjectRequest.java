package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取众筹详情
 * @author mengxc
 *
 */
public class ProjectRequest extends ApiRequest {

	public ProjectRequest(String projectId) {
		super(String.format(ApiConstants.API_PROJECT, projectId));
	}
	
}

