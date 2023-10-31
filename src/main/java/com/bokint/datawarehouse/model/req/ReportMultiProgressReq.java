package com.bokint.datawarehouse.model.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class ReportMultiProgressReq {

    private String projectCode;
    private String userCode;
    private int menuType;
    private int menuCode;
    private Date dateBegin;
    private Date dateEnd;
    private String keyword;

}
