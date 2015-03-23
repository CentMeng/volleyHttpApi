package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取我的账户相关资金统计信息
 * @author mengxc
 *
 */
public class StatisticsRequest extends ApiRequest {
    
    public StatisticsRequest() {
        super(ApiConstants.API_MY_STATISTICS);
    }
    
}
