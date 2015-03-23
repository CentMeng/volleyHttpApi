package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取众筹列表
 * @author mengxc
 *
 */
public class ProjectsSummaryRequest extends ApiRequest {

	public ProjectsSummaryRequest() {
		super(ApiConstants.API_PROJECTS_SUMMARY);
	}
	
}

