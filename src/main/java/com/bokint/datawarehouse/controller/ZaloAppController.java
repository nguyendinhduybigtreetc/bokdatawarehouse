package com.bokint.datawarehouse.controller;

import com.bokint.datawarehouse.model.req.ReportMultiProgressReq;
import com.bokint.datawarehouse.model.req.ReportStackedBarReq;
import com.bokint.datawarehouse.model.req.ReportRoseTableReq;
import com.bokint.datawarehouse.model.res.ReportMultiProgressRes;
import com.bokint.datawarehouse.model.res.ReportRoseTableRes;
import com.bokint.datawarehouse.model.res.ReportStackBarRes;
import com.bokint.datawarehouse.service.ZaloAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/zalo")
public class ZaloAppController {

    private final ZaloAppService zaloAppService;
    private static final Logger logger
            = LoggerFactory.getLogger(ZaloAppController.class);

    public ZaloAppController(ZaloAppService zaloAppService) {
        this.zaloAppService = zaloAppService;
    }

    //BOK00002: zalo app demo api
    @PostMapping("/usp-bi-report-rose-table")
    public ReportRoseTableRes uspBIReportRoseTable(@RequestBody ReportRoseTableReq reportRoseTableReq){
        logger.info(reportRoseTableReq.toString());
        return zaloAppService.reportRoseTable();
    }

    @PostMapping("/usp-bi-report-stacked-bar")
    public ReportStackBarRes uspBIReportStackedBar(@RequestBody ReportStackedBarReq reportStackedBarReq){
        logger.info(reportStackedBarReq.toString());
        return zaloAppService.reportStackedBar();
    }

    @PostMapping("/usp-bi-report-multi-progress")
    public ReportMultiProgressRes uspBIReportMultiProgress(@RequestBody ReportMultiProgressReq reportMultiProgressReq){
        logger.info(reportMultiProgressReq.toString());
        return zaloAppService.reportMultiProgress();
    }
}
