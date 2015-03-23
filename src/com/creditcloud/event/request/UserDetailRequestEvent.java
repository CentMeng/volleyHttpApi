package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 借款用户详情
 * 
 * @author mengxc
 *
 */
public class UserDetailRequestEvent extends ApiRequest {

    /**
     * @param loanId 借款标的ID
     */
	public UserDetailRequestEvent(String loanId) {
		super(String.format(ApiConstants.API_LOAN_USER_DETAIL, loanId));
	}
	
//	public UserDetailRequestEvent enableDiskCache() {
//		this.noDiskCache = false;
//		return this;
//	}
}
