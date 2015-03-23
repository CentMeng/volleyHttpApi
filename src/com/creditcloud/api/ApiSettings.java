package com.creditcloud.api;

/**
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-12-22 上午10:51:16
 * 
 */

public abstract class ApiSettings {
    
    public static String URL_BASE      = "http://feng.creditcloud.com/api/v2";
    
    public static String CLIENT_ID     = "bddc1dbb-0fe9-44ef-a3dc-6bdce55bd95e";
    
    public static String CLIENT_SECRET = "118b58a26b5759bc68db33f196430d567ec4fd03e38a105cf8e6c8b75964a950";
    
    public static String GRANT_TYPE    = "password";
    
    public static String CLIENT_CODE   = "fhjr";
    
    public static String URL_THIRD_PARTY_PAYMENT = "http://pay.soopay.net/spay/pay/payservice.do";
    
    public static String API_VERSION                 = "http://fhjr.qiniudn.com/version.json";
    
    public static int PAYMENT_VENDOR = ApiConstants.PAYMENT_VENDOR_UMP;
}
