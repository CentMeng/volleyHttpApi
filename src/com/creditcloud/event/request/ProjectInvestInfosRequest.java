package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取众筹项目投资信息
 * @author mengxc
 *
 */
public class ProjectInvestInfosRequest extends ApiRequest {
    
    public ProjectInvestInfosRequest() {
        super(ApiConstants.API_MY_PROJECT_INVESTINFOS);
        
        params.put("page", 1);
        params.put("pageSize", 20);
    }
    
}
