package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.ShippingAddress;

/**
 * 
 * 获取众筹回报地址
 * 
 * @author mengxc
 *
 */
public class OrderDetailRequest extends ApiRequest {
    
    public OrderDetailRequest(String rewardId, String projectId, String shippingAddress, String contact, String email,
            String realName, boolean needInvoice, String description, double fee) {
        super(ApiConstants.API_REWARD_ADDRESS);
        
        params.put("projectId", projectId);
        params.put("name", realName);
        params.put("mobile", contact);
        params.put("email", email);
        params.put("rewardId", rewardId);
        params.put("address", shippingAddress);
        params.put("description", description);
        params.put("needInvoice", needInvoice);
        params.put("rewardId", rewardId);
        params.put("shippingAddressId", "");
        params.put("fee", fee);
    }
    
    public OrderDetailRequest(String rewardId, String projectId, ShippingAddress address, String description,
            boolean needInvoice, double fee) {
        super(ApiConstants.API_REWARD_ADDRESS);
        
        params.put("projectId", projectId);
        params.put("name", address.realName);
        params.put("mobile", address.contact);
        params.put("email", address.email);
        params.put("rewardId", rewardId);
        params.put("address", address.detail);
        params.put("description", description);
        params.put("needInvoice", needInvoice);
        params.put("rewardId", rewardId);
        params.put("shippingAddressId", address.id);
        params.put("fee", fee);
    }
    
}
