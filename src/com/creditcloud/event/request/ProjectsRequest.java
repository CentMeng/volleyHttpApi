package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.enums.ProjectStatus;

/**
 * 获取众筹信息
 * @author mengxc
 *
 */
public class ProjectsRequest extends ApiRequest {

	public ProjectsRequest(String lastProjectId, int pageSize, ProjectStatus status) {
		super(ApiConstants.API_PROJECTS);
		
		params.put("lastProjectId", lastProjectId);
		params.put("pageSize",String.valueOf(pageSize));
		params.put("status", status.name());
	}
	
}

