package com.creditcloud.model;

/** 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 非200错误
 * 2014-10-4 下午5:46:50 
 * 
 */
public class ApiHttp400Error implements HttpError{

//	{"error":"invalid_request","error_description":"invalid loginName or password"}
	public String error;
	public ErrorDescription error_description;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public ErrorDescription getError_description() {
		return error_description;
	}
	public void setError_description(ErrorDescription error_description) {
		this.error_description = error_description;
	}
	
	
	
}
