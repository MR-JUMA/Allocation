//package com.example.demo.util;
//
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartUtilities;
//import org.jfree.chart.JFreeChart;
//import org.jfree.data.general.DefaultPieDataset;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//public class ReportUtilImpl implements ReportUtil{
//
//    @Override
//    public void generatePieChart(String path, List<Object[]> data) {
//
//        DefaultPieDataset dataset =new DefaultPieDataset();
//        for (Object[] objects:data) {
//            dataset.setValue(objects[0].toString(),new Double(objects[1].toString()));
//
//        }
//
//      //  final JFreeChart location_type_report = ChartFactory.createPieChart3D("location type report", dataset,true,true,true);
//
//        JFreeChart chart= ChartFactory.createPieChart3D("Location Type Report",dataset,true,true,false);
//        try {
//            ChartUtilities.saveChartAsJPEG(new File(path+"/pieChart.jpeg"),chart,300,300);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
