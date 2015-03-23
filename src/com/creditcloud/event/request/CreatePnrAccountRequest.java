package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/** 
 * 
 * 开通汇付（三方资金托管账户）
 * 
 * @author mengxc
 * 
 * 
 */
public class CreatePnrAccountRequest  extends ApiRequest {

    public CreatePnrAccountRequest(String userId) {
        super(ApiConstants.API_CREATE_UMP_ACCOUNT);
        params.put("userId", userId);
    }
    
}
