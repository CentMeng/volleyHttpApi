package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取众筹列表
 * @author mengxc
 *
 */
public class ProjectListRequest extends ApiRequest {

	public ProjectListRequest() {
		super(ApiConstants.API_PROJECTS_LIST);
		
	}
	
}

