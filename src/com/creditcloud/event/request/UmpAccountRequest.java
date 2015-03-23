package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取联动账户信息
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2015-2-2 下午1:30:03
 * 
 */
public class UmpAccountRequest extends ApiRequest {
    
    public UmpAccountRequest() {
        super(ApiConstants.API_PAYMENT);
    }
    
}
