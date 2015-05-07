package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

public class CheckCerNoRequest extends ApiRequest{

	public CheckCerNoRequest(String idNumber) {
		super(ApiConstants.API_CHECKCERNO);
		params.put("idNumber", idNumber);
	}

}
