package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 结果集
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2015-1-8 下午1:19:47
 * 
 */
public class PagedResult<T> implements Serializable {
    
    private static final long serialVersionUID = 4661628702680899639L;
    
    public List<T> results;

    public int totalSize;
    
}
