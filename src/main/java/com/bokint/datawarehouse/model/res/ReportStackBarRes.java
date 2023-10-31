package com.bokint.datawarehouse.model.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportStackBarRes {

    private List<ItemReportStackBar> listItem;
    private String notification;
    private String status;

}
