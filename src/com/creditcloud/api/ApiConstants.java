package com.creditcloud.api;

public class ApiConstants {

	public final static int PAYMENT_VENDOR_UMP = 1;
	public final static int PAYMENT_VENDOR_CHINAPNR = 2;

	public final static String API_LOGIN = "/token";

	public final static String API_REGISTER = "/api_register";

	/**
	 * 发送手机验证码
	 */
	public final static String API_SMS_CAPTCHA = "/register/smsCaptcha";

	public final static String API_BANNERS = "/cms/mobileBanners";

	public final static String API_LOANS_SUMMARY = "/loans/summary";

	public final static String API_LOANS_SUMMARY_PURPOSE = "/loans/summary/purpose/%1$s";

	public final static String API_LOANS = "/loans";

	public final static String API_LOAN_FILTER = "/loans/filter";

	public final static String API_LOAN_PAGE = "/loans/getLoanWithPage";

	public final static String API_LOANS_PURPOSE = "/loans/purpose/%1$s";

	public final static String API_LOAN = "/loan/%1$s";

	public final static String API_CORPORATION = "/loan/getCorporation/%1$s";

	public final static String API_LOAN_USER = "/loan/%1$s/user";

	public final static String API_LOAN_DETAIL = "/loan/%1$s/detail";

	public final static String API_LOAN_INVESTS = "/loan/%1$s/invests";

	public final static String API_PROJECTS_SUMMARY = "/crowdfundings/summary";

	public final static String API_PROJECTS = "/crowdfundings";

	public final static String API_PROJECTS_LIST = "/crowdfundings/list";

	public final static String API_REWARDS = "/crowdfunding/%1$s/rewards";

	public final static String API_REWARD_RELATE = "/crowdfunding/MYSELF/tenderPrepare";

	public final static String API_PROJECT = "/crowdfunding/%1$s";

	public final static String API_PROJECT_PROOFS = "/crowdfunding/%1$s/proofs";

	public final static String API_LOAN_PROOFS = "/loan/request/%1$s/proofs";

	public final static String API_MY_PROJECT_INVESTS = "/crowdfundings/MYSELF/listInvestedProjects";

	/**
	 * 众筹项目投资信息
	 */
	public final static String API_MY_PROJECT_INVESTINFOS = "/crowdfunding/user/MYSELF/investInfos";

	/*
	 * 标记喜爱
	 */
	public final static String API_MARK_FAVORITE = "/crowdfunding/%1$s/user/MYSELF/markFavorite";

	/**
	 * 取消我喜爱的众筹项目
	 */
	public final static String API_UNMARK_FAVORITE = "/crowdfunding/%1$s/user/MYSELF/unmarkFavorite";

	/**
	 * 获取当前项目喜爱总数
	 */
	public final static String API_FAVORITE_COUNT = "/crowdfunding/%1$s/favoriteCount";

	/**
	 * 检测当前是否加过喜爱
	 */
	public final static String API_ISFAVORITE = "/crowdfunding/MYSELF/isFavoriteProject/%1$s";

	/**
	 * 我的投资
	 */
	public final static String API_MY_INVESTS = "/user/MYSELF/invests";

	/**
	 * 按照借款用户获取我的投资
	 */
	public final static String API_MY_INVESTS_PURPOSE = "/user/MYSELF/invests/purpose/%1$s";

	public final static String API_MY_FUND_ACCOUNT = "/user/MYSELF/fundaccounts";

	public final static String API_MY_FUND = "/user/MYSELF/userfund";

	public final static String API_MY_PAYMENT_ACCOUNT = "/user/MYSELF/payment";

	public final static String API_CREATE_UMP_ACCOUNT = "/upayment/register/MYSELF";

	/**
	 * 用户签署的联动协议
	 */
	public final static String API_MY_AGREEMENT = "/user/MYSELF/agreement";

	public final static String API_MY_AUTHENTICATES = "/user/MYSELF/authenticates";

	public final static String API_MY_FUND_RECORDS = "/user/MYSELF/funds";

	/**
	 * 我的账户相关资金统计信息
	 */
	public final static String API_MY_STATISTICS = "/user/MYSELF/statistics";

	public final static String API_UMP = "http://pay.soopay.net/spay/pay/payservice.do";

	public final static String API_BINDCARD = "/upayment/bindCard/MYSELF";

	/**
	 * 投标（联动）
	 */
	public final static String API_UPAYMENT_TENDER = "/upayment/tender/MYSELF";

	public final static String API_UPAYMENT_NO_PWD = "/upayment/tenderNoPwd/user/MYSELF/loan/%1$s/amount/%2$s";

	public final static String API_UPAYMENT_PROJECT_TENDER = "/upayment/projectTender/MYSELF";

	/**
	 * 众筹回报地址
	 */
	public final static String API_REWARD_ADDRESS = "/upayment/prepareProjectTender/MYSELF";

	public final static String API_FUNDS = "/account/funds";

	public final static String API_INVESTS = "/account/getInvest";

	public final static String API_STOCKDATA = "/account/stockData";

	public final static String API_SHIPPING_ADDRESS = "/user/MYSELF/shippingAddress/%1$s";

	public final static String API_FEEDBACK = "/user/MYSELF/feedback";

	/**
	 * 点赞
	 */
	public final static String API_MARKLIKE = "/crowdfunding/%1$s/user/MYSELF/markLike";

	/**
	 * 取消我点赞的众筹项目
	 */
	public final static String API_UNMARKLIKE = "/crowdfunding/%1$s/user/MYSELF/unmarkLike";

	/**
	 * 是否点过赞
	 */
	public final static String API_ISLIKE = "/user/MYSELF/isMyLikeProject/%1$s";

	/**
	 * 点赞总数
	 */
	public final static String API_LIKECOUNT = "/crowdfunding/%1$s/likeCount";

	/**
	 * 联动优势账户
	 */
	public final static String API_PAYMENT = "/MYSELF/payment";

	public final static String API_LOAN_USER_DETAIL = "/loan/%1$s/user";

	/**
	 * 汇付投标
	 */
	public final static String API_PAYMENT_TENDER = "/payment/tender/request";

	/**
	 * 汇付绑卡
	 */
	public final static String API_PAYMENT_BINDCARD = "/payment/card/bind/request";

	/**
	 * 汇付开户
	 */
	public final static String API_CREATE_PNR_ACCOUNT = "/account/open/request";

	/**
	 * 第三方资金托管：汇付测试环境
	 */
	public final static String URL_THIRD_PARTY_PNR_DEBUG = "http://mertest.chinapnr.com/muser/publicRequests";

	/**
	 * 第三方资金托管：汇付生成环境
	 */
	public final static String URL_THIRD_PARTY_PNR = "https://lab.chinapnr.com/muser/publicRequests";

	/**
	 * 第三方资金托管：联动环境
	 */
	public final static String URL_THIRD_PARTY_UMP = "http://pay.soopay.net/spay/pay/payservice.do";
}
