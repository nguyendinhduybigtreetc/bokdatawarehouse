package com.bokint.datawarehouse.model.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemReportMultiProgress {

    private String name;
    private String id;
    private int finished;
    private int total;

}
