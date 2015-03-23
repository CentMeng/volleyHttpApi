package com.creditcloud.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 投资记录列表
 * 
 * @author mengxc
 *
 */
public class Invests implements Serializable {
	
    private static final long serialVersionUID = -7780719530610866454L;

    /**
     * 当前投资记录列表
     */
    public List<Invest> results = new ArrayList<Invest>();
	
    /**
     * 投资记录总数
     */
	public int totalSize;
	
}
