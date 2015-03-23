package com.creditcloud.event.request;

import android.text.TextUtils;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.enums.LoanPurpose;
import com.creditcloud.model.enums.LoanStatus;

/**
 * 检索借款标的列表
 * 
 * @author mengxc
 * 
 */
public class LoansFilterRequest extends ApiRequest {
    
    /**
     * 
     * @param lastLoanId 上一次的标的ID
     * @param pageSize 标的数量
     * @param status 标的状态
     * @param minDuration 最小借款标的期限
     * @param maxDuration 最大借款标的期限
     * @param minRate 最小借款标的年化利率
     * @param maxRate 最大借款标的年化利率
     * @param purpose 借款类型
     */
    public LoansFilterRequest(String lastLoanId, int pageSize, LoanStatus status, int minDuration, int maxDuration,
            int minRate, int maxRate, LoanPurpose purpose) {
        super(ApiConstants.API_LOAN_FILTER);
        
        params.put("lastLoanId", lastLoanId);
        params.put("pageSize", String.valueOf(pageSize));
        params.put("status", status.name());
        params.put("minDuration", minDuration);
        params.put("maxDuration", maxDuration);
        params.put("minRate", minRate);
        params.put("maxRate",maxRate);
        params.put("purpose", purpose.name());
    }
    
    /**
     * 
     * @param lastLoanId 上一次的标的ID
     * @param pageSize 标的数量
     * @param status 标的状态
     * @param minDuration 最小借款标的期限
     * @param maxDuration 最大借款标的期限
     * @param minRate 最小借款标的年化利率
     * @param maxRate 最大借款标的年化利率
     * @param method 还款方式
     */
    public LoansFilterRequest(String lastLoanId, int pageSize, String status, int minDuration, int maxDuration,
            int minRate, int maxRate, String method) {
        super(ApiConstants.API_LOAN_FILTER);
        
        params.put("lastLoanId", lastLoanId);
        params.put("pageSize", String.valueOf(pageSize));
        params.put("minDuration", minDuration);
        params.put("maxDuration", maxDuration);
        params.put("minRate", minRate);
        params.put("maxRate", maxRate);
        
        if (!TextUtils.isEmpty(method)) {
        	params.put("method", method);
        }
        
        if (!TextUtils.isEmpty(status)) {
        	params.put("status", status);
        }
    }
    
    /**
     * 
     * @param lastLoanId 上一次的标的ID
     * @param pageSize 标的数量
     * @param status 标的状态
     * @param minDuration 最小借款标的期限
     * @param maxDuration 最大借款标的期限
     * @param minRate 最小借款标的年化利率
     * @param maxRate 最大借款标的年化利率
     */
    public LoansFilterRequest(String lastLoanId, int pageSize, String status, int minDuration, int maxDuration,
            int minRate, int maxRate) {
        super(ApiConstants.API_LOAN_FILTER);
        
        params.put("lastLoanId", lastLoanId);
        params.put("pageSize", String.valueOf(pageSize));
        params.put("minDuration", minDuration);
        params.put("maxDuration", maxDuration);
        params.put("minRate", minRate);
        params.put("maxRate", maxRate);
        
        if (!TextUtils.isEmpty(status)) {
        	params.put("status", status);
        }
    }
    
}
