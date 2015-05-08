package com.creditcloud.model;

import com.creditcloud.event.ApiResponse;

/**
 * 用户统计信息
 * 
 * @author mengxc
 *
 */
public class UserStatisticsResponse extends ApiResponse{

    /**
     * 认证信息完善情况
     */
	public double certificateProgress;
	
	/**
	 * 用户借款信息统计
	 */
	public StatisticsLoan loan;
	
	/**
	 * 用户投资信息统计
	 */
	public StatisticsInvest invest;

	public double getCertificateProgress() {
		return certificateProgress;
	}

	public void setCertificateProgress(double certificateProgress) {
		this.certificateProgress = certificateProgress;
	}

	public StatisticsLoan getLoan() {
		return loan;
	}

	public void setLoan(StatisticsLoan loan) {
		this.loan = loan;
	}

	public StatisticsInvest getInvest() {
		return invest;
	}

	public void setInvest(StatisticsInvest invest) {
		this.invest = invest;
	}
	
	
	
}
