package com.fujie.learn.week4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/19
 **/
public class FormatUtil {
    public static String formate(Date date, String s){
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(date);
    }
    public static String format(double number){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(number);
    }
    public static String format(Date date, String regex){
        SimpleDateFormat sdf = new SimpleDateFormat(regex);
        return sdf.format(date);
    }
    public static String format(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(date);
    }
}
