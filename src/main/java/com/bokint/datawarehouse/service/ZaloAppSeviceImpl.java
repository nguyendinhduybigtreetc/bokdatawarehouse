package com.bokint.datawarehouse.service;

import com.bokint.datawarehouse.model.res.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ZaloAppSeviceImpl implements ZaloAppService{

    Random random = new Random();
    @Override
    public ReportRoseTableRes reportRoseTable() {
        ReportRoseTableRes reportRoseTableRes = new ReportRoseTableRes();
        reportRoseTableRes.setListTitle(new String[]{"count", "name", "style", "total"});
        List<ItemReportRoseTable> itemReportRoseTableList = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            String label = String.valueOf((char) (random.nextInt(26) + 'A'));
            int value1 = random.nextInt(10) + 1;
            int value2 = random.nextInt(100000);
            itemReportRoseTableList.add(new ItemReportRoseTable(i, label, value1, value2));
        }
        reportRoseTableRes.setListItem(itemReportRoseTableList);
        reportRoseTableRes.setStatus("Success");
        return reportRoseTableRes;
    }

    @Override
    public ReportStackBarRes reportStackedBar() {
        ReportStackBarRes reportStackBarRes = new ReportStackBarRes();
        List<ItemReportStackBar> itemReportStackBarList = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            for (char c = 'A'; c <= 'E'; c++) {
                itemReportStackBarList.add(new ItemReportStackBar(i + String.valueOf(c), random.nextInt(1000)));
            }
        }
        reportStackBarRes.setListItem(itemReportStackBarList);
        reportStackBarRes.setStatus("Success");
        return reportStackBarRes;
    }

    @Override
    public ReportMultiProgressRes reportMultiProgress() {
        ReportMultiProgressRes reportMultiProgressRes = new ReportMultiProgressRes();
        List<ItemReportMultiProgress> itemReportMultiProgressList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            String label = generateRandomString(5);
            String code = generateRandomString(8);
            int value1 = random.nextInt(2000) + 1000;
            int value2 = random.nextInt(1000) + 500;
            itemReportMultiProgressList.add(new ItemReportMultiProgress(label, code, value1, value2));
        }
        reportMultiProgressRes.setListItem(itemReportMultiProgressList);
        reportMultiProgressRes.setStatus("MES00001");
        reportMultiProgressRes.setStatus("Success");
        return reportMultiProgressRes;
    }
    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
