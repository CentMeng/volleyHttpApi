package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 认证信息：实名验证、手机验证、邮箱验证、微博认证、微信认证
 * 
 * @author mengxc
 *
 */
public class AuthenticatesRequest extends ApiRequest {
    
    public AuthenticatesRequest() {
        super(ApiConstants.API_MY_AUTHENTICATES);
    }
    
}
