package com.creditcloud.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 借款标的列表索引（各取最多10条记录）
 * 
 * @author mengxc
 * 
 */
public class Loans {
    
    /**
     * 开放标的列表
     */
    public List<Loan> open      = new ArrayList<Loan>();
    
    /**
     * 待发布标的列表
     */
    public List<Loan> scheduled = new ArrayList<Loan>();
    
    /**
     * 已满标列表
     */
    public List<Loan> finished  = new ArrayList<Loan>();
    
    /**
     * 已结算列表
     */
    public List<Loan> settiled  = new ArrayList<Loan>();
    
    public List<Loan> toAll( ) {
        ArrayList<Loan> array = new ArrayList<Loan>();
        array.addAll(scheduled);
        array.addAll(open);
        array.addAll(finished);
        array.addAll(settiled);
        return array;
    }
}
