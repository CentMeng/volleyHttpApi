package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 取消我点赞的众筹项目
 * @author mengxc
 *
 */
public class UnmarkLikeRequest extends ApiRequest {
    
    public UnmarkLikeRequest(String projectId) {
        super(String.format(ApiConstants.API_UNMARKLIKE, projectId));
    }
}
