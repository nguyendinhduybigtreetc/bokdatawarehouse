package com.bokint.datawarehouse.model.req;

import lombok.Data;

import java.util.Date;

@Data
public class ReportStackedBarReq {

    private String projectCode;
    private String userCode;
    private String menuType;
    private String menuCode;
    private Date dateBegin;
    private Date dateEnd;
    private String keyword;
}
