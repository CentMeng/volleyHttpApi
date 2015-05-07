package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

public class UserFundRequest extends ApiRequest{

	public UserFundRequest(String values) {
		super(String.format(ApiConstants.API_USER_FUND, values));
	}

}
