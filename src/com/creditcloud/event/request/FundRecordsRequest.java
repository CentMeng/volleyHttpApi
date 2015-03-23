package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.enums.FundRecordType;

/**
 * 用户资金流水
 * 
 * @author mengxc
 *
 */
public class FundRecordsRequest extends ApiRequest {
    
    public FundRecordsRequest(int page, int pageSize, FundRecordType type) {
        super(ApiConstants.API_MY_FUND_RECORDS);
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("type", type.name());
        params.put("allStatus", false);
        params.put("allOperation", false);
        params.put("startDate", 1369843200000L);
        params.put("endDate", System.currentTimeMillis());
    }
    
//    public FundRecordsRequest enableDiskCache( ) {
//        this.noDiskCache = false;
//        return this;
//    }
    
}
