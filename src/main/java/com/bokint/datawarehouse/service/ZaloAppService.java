package com.bokint.datawarehouse.service;

import com.bokint.datawarehouse.model.res.ReportMultiProgressRes;
import com.bokint.datawarehouse.model.res.ReportRoseTableRes;
import com.bokint.datawarehouse.model.res.ReportStackBarRes;

public interface ZaloAppService {
    ReportRoseTableRes reportRoseTable();

    ReportStackBarRes reportStackedBar();

    ReportMultiProgressRes reportMultiProgress();
}
