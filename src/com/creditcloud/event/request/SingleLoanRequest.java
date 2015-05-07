package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

public class SingleLoanRequest extends ApiRequest{

	public SingleLoanRequest(String values) {
		super(ApiConstants.API_SINGLE_LOAN+"/"+values);
	}

}
