package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 对众筹项目进行点赞
 * 
 * @author mengxc
 *
 */
public class MarkLikeRequest extends ApiRequest {
    
    public MarkLikeRequest(String projectId) {
        super(String.format(ApiConstants.API_MARKLIKE, projectId));
    }
}
