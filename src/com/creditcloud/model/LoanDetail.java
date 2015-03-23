package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * 借款标的详情
 * @author mengxc
 *
 */
public class LoanDetail implements Serializable {
        
        private static final long serialVersionUID = 4448330559456392457L;
        
        /**
         * 标的基本信息
         */
        public Loan               loan;
        
        /**
         * 标的关联企业扩展信息
         */
        public CorporationExt     corporation;
        
        /**
         * 标的认证信息
         */
        public List<ProofExt>     proofs;
        
        /**
         * 用户详情
         */
        public UserDetail         user;
        
        /**
         * 
         */
        public long               serverDate;
}
