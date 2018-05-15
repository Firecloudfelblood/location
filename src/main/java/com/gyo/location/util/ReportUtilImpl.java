package com.gyo.location.util;

import javafx.scene.chart.Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReportUtilImpl implements ReportUtil {
    @Override
    public void generatePieChart(String path, List<Object[]> data) {

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object[] objects: data){
            dataset.setValue(objects[0].toString(), new Double(objects[1].toString()));
        }

        JFreeChart chart = ChartFactory.createPieChart3D("Location Type Report", dataset);

        try {
            ChartUtilities.saveChartAsJPEG(new File(path), chart, 400,400);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
