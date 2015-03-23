package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.enums.LoanPurpose;

/**
 * 获取我的投资
 * @author mengxc
 *
 */
public class MyInvestsRequest extends ApiRequest {

	public LoanPurpose purpose;

	/**
	 * @param page 页码（从1开始）
	 * @param pageSize 当前数量
	 */
	public MyInvestsRequest(int page, int pageSize) {
		super(ApiConstants.API_MY_INVESTS);
		
		addToForm("pageSize", pageSize).addToForm("page", page);
	}
	
	public MyInvestsRequest(int page, int pageSize, LoanPurpose purpose) {
		super(String.format(ApiConstants.API_MY_INVESTS_PURPOSE, purpose.name()));
		
		addToForm("pageSize", pageSize).addToForm("page", page);
		
		this.purpose = purpose;
	}
	
	public MyInvestsRequest addToForm(String key, int value) {
		params.put(key, String.valueOf(value));
		return this;
	}
}
