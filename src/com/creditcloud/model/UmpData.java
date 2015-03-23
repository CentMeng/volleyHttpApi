package com.creditcloud.model;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * 联动优势数据信息
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-13 下午5:31:04
 * 
 */
public class UmpData {
	public String mer_date;
	public String partic_account_id;
	public String sign_type;
	public String notify_url;
	public String charset;
	public String order_id;
	public String version;
	public String amount;
	public String sign;
	public String partic_type;
	public String serv_type;
	public String partic_user_id;
	public String mer_id;
	public String partic_acc_type;
	public String project_id;
	public String service;
	public String project_account_id;
	public String trans_action;
	public String res_format;
	public String ret_url;

	public Map<String, String> toMap() {
		Map<String, String> request = new HashMap<String, String>();
		request.put("mer_date", mer_date);
		request.put("partic_account_id", partic_account_id);
		request.put("sign_type", sign_type);
		request.put("notify_url", notify_url);
		request.put("charset", charset);
		request.put("order_id", order_id);
		request.put("version", version);
		request.put("amount", amount);

		request.put("sign", sign);
		request.put("partic_type", partic_type);
		request.put("serv_type", serv_type);
		request.put("partic_user_id", partic_user_id);
		request.put("partic_acc_type", partic_acc_type);
		request.put("project_id", project_id);
		request.put("service", service);

		request.put("project_account_id", project_account_id);
		request.put("trans_action", trans_action);
		request.put("res_format", res_format);
		request.put("ret_url", ret_url);

		return request;
	}
}
