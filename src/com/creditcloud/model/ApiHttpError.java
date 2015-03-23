package com.creditcloud.model;

/** 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 非200错误
 * 2014-10-4 下午5:46:50 
 * 
 */
public class ApiHttpError {

//	{"error":"invalid_request","error_description":"invalid loginName or password"}
	public String error;
	public String error_description;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError_description() {
		return error_description;
	}
	public void setError_description(String error_description) {
		this.error_description = error_description;
	}
	
}
