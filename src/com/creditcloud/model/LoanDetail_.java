package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/** 
 * 借款标的详情
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-11-13 下午4:19:57 
 * 
 */
@Deprecated
public class LoanDetail_ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -490477868463093503L;

	Loan loan;
	
	CorporationExt corporation;
	
	List<ProofExt> proof;
}
