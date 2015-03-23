package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/** 
 * 
 * 开通联动优势（三方资金托管账户）
 * 
 * @author mengxc
 * 
 */
public class CreateUmpAccountRequest  extends ApiRequest {

    public CreateUmpAccountRequest(String name, String idNumber) {
        super(ApiConstants.API_CREATE_UMP_ACCOUNT);
        params.put("userName", name);
        params.put("idCode", idNumber);
    }
    
}
