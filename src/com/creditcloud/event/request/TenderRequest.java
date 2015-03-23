package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 
 * 投标（汇付）
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2015-2-11 上午11:48:22
 * 
 */
public class TenderRequest extends ApiRequest {
    
    public TenderRequest(String userId, String loanId, double amount) {
        super(String.format(ApiConstants.API_PAYMENT_TENDER));
        
        params.put("loanId", loanId);
        params.put("amount", amount);
        params.put("userId", userId);
    }
    
}
