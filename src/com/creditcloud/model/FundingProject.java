package com.creditcloud.model;

import java.io.Serializable;

/**
 * @author mengxc ( csdn@vip.163.com )
 */
public class FundingProject implements Serializable {
    
    public static final long serialVersionUID = 375973318473262975L;
    
    public String            id;
    
    /**
     * 项目标题
     */
    public String            title;
    
    /**
     * 项目类型（见ProjectCategory）
     */
    public String            category;
    
    /**
     * 项目发起人
     */
    public String            userId;
    
    /**
     * 目标金额
     */
    public double            goalAmount;
    
    /**
     * 实际募集金额
     */
    public double            raiseAmount;
    
    /**
     * 募集笔数
     */
    public int               raiseNumber;
    
    /**
     * 筹集天数
     */
    public int               timeOut;
    
    /**
     * 项目视频地址
     */
    public String            videoUrl;
    
    /**
     * 简介
     */
    public String            introduction;
    
    /**
     * 详情
     */
    public String            detail;
    
    /**
     * 喜爱数量
     */
    public int               favorite;
    
    /**
     * 点赞数，这个值需要单独取
     */
    public int               likes;
    
    /**
     * 开放时间
     */
    public long              openTime;
    
    /**
     * 项目状态：status 提交投标申请 INITIATED("初始"), SCHEDULED("待发布"), OPENED("众筹中"),
     * PROPOSED("申请投标"), 抢标成功,资金被冻结等待募集期结束时结算 FROZEN("账户资金冻结"), 冻结资金失败
     * FROZEN_FAILED("资金冻结失败"), 标没有成功募集 FAILED("流标"), 本标在募集期募集成功,等待统一结算
     * FINISHED("投标成功"), 被后台取消 CANCELED("已取消"), 完成资金结算,借贷关系确立 SETTLED("已结算"),
     * 收回所有本息 CLEARED("还款完成"), 还款逾期 OVERDUE("逾期"), 贷款违约,剩余贷款无法偿还 BREACH("违约");
     */
    public String            status;
    
    /**
     * 完成时间
     */
    public long              finishTime;
    
    /**
     * 地址
     */
    public String            location;
    
    /**
     * 标的金额
     */
    public double            loanAmount;
    
    /**
     * project without reward, reward is mandatory most of the time
     */
    public boolean           noReward;
    
    /**
     * 发起人信息
     */
    public String            qualification;
    
    /**
     * 博客
     */
    public String            blog;
    
    /**
     * 网址
     */
    public String            website;
    
    /**
     * 联系邮箱
     */
    public String            email;
    
    /**
     * 联系电话
     */
    public String            mobile;
    
    /**
     * 自我介绍
     */
    public String            selfDescription;
    
    /**
     * 详细介绍
     */
    public String            detailDescription;
    
    /**
     * 感谢信
     */
    public String            acknowledgement;
    
}
