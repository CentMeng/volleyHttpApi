package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/** 
 * 
 * 标记喜爱的众筹
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-17 下午1:58:15 
 * 
 */

public class MarkFavoriteRequest extends ApiRequest {

	public MarkFavoriteRequest(String projectId) {
		super(String.format(ApiConstants.API_MARK_FAVORITE, projectId));
	}
	
}

