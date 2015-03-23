package com.creditcloud.model;

import java.io.Serializable;

/** 
 * 
 * 联动优势协议
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2015-1-12 下午6:08:54 
 * 
 */
public class UmpAgreement implements Serializable {

    private static final long serialVersionUID = 6276755720168843993L;
    
    /**
     * 账户名称
     */
    public String accountName;

    /**
     * 用户ID
     */
    public String userId;

    /**
     * 无密快捷协议:ZCZP0800
     */
    public boolean instant;

    /**
     * 无密投资协议:ZTBB0G00
     */
    public boolean invest;

    /**
     * 无密还款协议:ZHKB0H01
     */
    public boolean repay;

    /**
     * 借记卡快捷协议:ZKJP0700
     */
    public boolean debit;
    
    /**
     * 卡号暂存，UMP绑卡结果只包含经过遮挡的卡号
     */
    public String cardNo;
}
