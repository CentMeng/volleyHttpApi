package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取众筹项目投资记录
 * 
 * @author mengxc
 *
 */
public class ProjectInvestsRequest extends ApiRequest {
    
    public ProjectInvestsRequest() {
        super(ApiConstants.API_MY_PROJECT_INVESTS);
        
        params.put("page", 1);
        params.put("pageSize", 20);
    }
    
}
