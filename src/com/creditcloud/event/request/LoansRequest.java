package com.creditcloud.event.request;

import android.content.Context;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.enums.LoanPurpose;
import com.creditcloud.model.enums.LoanStatus;

/**
 * 获取借款标的列表
 * 
 * @author mengxc
 *
 */
public class LoansRequest extends ApiRequest {
    
    public LoansRequest(String lastLoanId, int pageSize, LoanStatus status) {
        super(ApiConstants.API_LOANS);
        
        params.put("lastLoanId", lastLoanId);
        params.put("pageSize", String.valueOf(pageSize));
        params.put("status", status.name());
        
    }
    
    public LoansRequest(Context ctx, LoanPurpose purpose) {
        super(String.format(ApiConstants.API_LOANS_PURPOSE, purpose.name()));
    }
    
}
