package com.gyo.location.util;

import java.util.List;
import org.springframework.stereotype.Component;

public interface ReportUtil {

    void generatePieChart(String path, List<Object[]> data);
}
