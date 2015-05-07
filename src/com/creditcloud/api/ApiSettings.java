package com.creditcloud.api;

/**
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-12-22 上午10:51:16
 * 
 */

public abstract class ApiSettings {
    
    public static String URL_BASE      = "http://101.226.171.148/api/v2";
    
    public static String CLIENT_ID     = "dcde7486-fca7-4b2a-be26-daf5960c3af9";
    
    public static String CLIENT_SECRET = "59b4e4532201efa6d08936f2ee4ff299bcc1f0e182560a740178c691e5adee4a";
    
    public static String GRANT_TYPE    = "password";
    
    //只登录需要
    public static String CLIENT_CODE   = "fhjr";
    
    public static String URL_THIRD_PARTY_PAYMENT = "http://pay.soopay.net/spay/pay/payservice.do";
    
    public static String API_VERSION                 = "http://101.226.171.148/app.json";
    
    public static int PAYMENT_VENDOR = ApiConstants.PAYMENT_VENDOR_UMP;
}
