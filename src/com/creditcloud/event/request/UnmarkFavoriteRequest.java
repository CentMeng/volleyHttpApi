package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 取消我喜爱的众筹项目
 * @author mengxc
 *
 */
public class UnmarkFavoriteRequest extends ApiRequest {

	public UnmarkFavoriteRequest(String projectId) {
		super(String.format(ApiConstants.API_UNMARK_FAVORITE, projectId));
	}
}
