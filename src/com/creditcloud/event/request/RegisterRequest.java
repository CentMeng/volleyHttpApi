package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.api.ApiSettings;
import com.creditcloud.event.ApiRequest;

/**
 * 用户注册
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-4 下午4:53:19
 * 
 */
public class RegisterRequest extends ApiRequest {
    
    /**
     * 
     * @param mobile 手机号
     * @param password  密码
     * @param mobileCaptcha 手机验证码
     */
    public RegisterRequest(String mobile, String password, String mobileCaptcha) {
        super(ApiConstants.API_REGISTER);
        
        params.put("mobile", mobile);
        params.put("password", password);
        params.put("loginName", ApiSettings.CLIENT_CODE + mobile);
        params.put("mobile_captcha", mobileCaptcha);
    }
    
    /**
     * 
     * @param mobile 手机号
     * @param loginName 登录名
     * @param password  密码
     * @param mobileCaptcha 手机验证码
     */
    public RegisterRequest(String mobile, String loginName, String password, String mobileCaptcha) {
        super(ApiConstants.API_REGISTER);
        
        params.put("mobile", mobile);
        params.put("password", password);
        params.put("loginName", loginName);
        params.put("mobile_captcha", mobileCaptcha);
    }
    
}
