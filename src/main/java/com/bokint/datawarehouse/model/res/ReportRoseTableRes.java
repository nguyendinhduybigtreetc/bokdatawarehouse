package com.bokint.datawarehouse.model.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportRoseTableRes {

    private String[] listTitle;
    private String[] listHiddenTitle;
    private List<ItemReportRoseTable> listItem;
    private String notification;
    private String status;
}
