package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.ShippingAddress;

/**
 * 更新我的收货地址
 * @author mengxc
 *
 */
public class ShippingAddressRequest extends ApiRequest {
    
    public ShippingAddressRequest(ShippingAddress sa) {
        super(String.format(ApiConstants.API_SHIPPING_ADDRESS, String.valueOf(sa.id)));
        
        params.put("realName", sa.realName);
        params.put("contact", sa.contact);
        params.put("email", sa.email);
        params.put("detail", sa.detail);
        params.put("alias", sa.alias);
    }
    
}
