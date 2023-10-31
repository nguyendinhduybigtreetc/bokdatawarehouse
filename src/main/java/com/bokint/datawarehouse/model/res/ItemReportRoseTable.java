package com.bokint.datawarehouse.model.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemReportRoseTable {

    private int count;
    private String name;
    private int style;
    private int total;

}
