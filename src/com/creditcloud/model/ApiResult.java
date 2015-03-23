package com.creditcloud.model;

import java.lang.reflect.Method;
import java.util.List;

import android.text.TextUtils;


/**
 * 返回请求
 * @author mengxc
 *
 */
public class ApiResult{
    
    /**
     * 返回具体数据
     */
    public Object date;
    
    public boolean success;
    
    /**
     * 错误列表
     */
    public ApiError error;
    
    public String error_description;
    
    public boolean  needToLogin = false;
    
    public boolean isError(){
    	return !TextUtils.isEmpty(error.getMessage());
    }
    
    public String getErrorMessage(){
    	
    		return ErrorInfo.getMsg(error.getMessage());
    	}
//    	if(error.getClass().equals(ApiError_.class)){
//    		Method method = null;
//			try {
//				method = error.getClass().getMethod("getError");
//				System.out.println("method_ApiError_:"+method.toString());
//			} catch (NoSuchMethodException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    		return method.toString();
//    	}else if(error.getClass().equals(String.class)){
//    		System.out.println("method_String : "+error);
//    		return error.toString();
//    	}else{
//    		Method method = null;
//			try {
//				method = error.getClass().getMethod("getMessage");
//				System.out.println("method_List : "+error);
//			} catch (NoSuchMethodException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    		
//        	return ErrorInfo.getMsg(method.toString());
//    	}
    
    
    
  

	

	public void needToLogin( int failedAttempts ) {
        success = false;
        needToLogin = true;
        ApiError error = new ApiError();
        
        if (failedAttempts == -2) {
            error.message = "用户被禁用，请拨打客服电话：400-076-1166";
        }
        else if (failedAttempts < 0) {
            error.message = "授权失效，请重新登录";
        }
        else {
            // error.message = String.format("用户名或者密码错误，还有%1$s次重试机会", 5 -
            // failedAttempts);
            error.message = String.format("用户名或者密码错误");
        }
    }
	

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ApiError getError() {
		return error;
	}

	public void setError(ApiError error) {
		this.error = error;
	}

	public String getError_description() {
		return error_description;
	}

	public void setError_description(String error_description) {
		this.error_description = error_description;
	}

	public boolean isNeedToLogin() {
		return needToLogin;
	}

	public void setNeedToLogin(boolean needToLogin) {
		this.needToLogin = needToLogin;
	}
    
    
    

    
}
