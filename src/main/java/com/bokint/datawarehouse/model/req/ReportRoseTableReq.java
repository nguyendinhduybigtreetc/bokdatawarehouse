package com.bokint.datawarehouse.model.req;

import lombok.Data;

import java.util.Date;

@Data
public class ReportRoseTableReq {

    private String projectCode;
    private String userCode;
    private int menuType;
    private int menuCode;
    private Date dateBegin;
    private Date dateEnd;
}
