package com.creditcloud.model;

import java.io.Serializable;

/** 
 * 资金托管账户（汇付）
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2015-2-11 下午4:01:53 
 * 
 */
public class PaymentAccount implements Serializable {

    private static final long serialVersionUID = 553691154541070117L;
    
    /**
     * 用户的唯一ID，与UserService中的一致
     */
    public String userId;

    /**
     * 由三方支付生成的用户唯一ID, UsrCustId
     */
    public String accountId;

    /**
     * 用户在三方支付中的用户名，可以与loginName不同, UsrId
     */
    public String accountName;

    public long timeCreate;
}
