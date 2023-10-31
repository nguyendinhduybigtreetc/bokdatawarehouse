package com.bokint.datawarehouse.model.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportMultiProgressRes {

    private List<ItemReportMultiProgress> listItem;
    private String notification;
    private String status;
}
