package com.fujie.learn.week4;

import java.util.Date;

/**
 * @ClassName FormatApp
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/19
 **/
public class FormatApp {
    public static void main(String[] args) {
        System.out.println(FormatUtil.format(new Date()));
        System.out.println(FormatUtil.format(new Date(),"yyyy年MM月dd日 HH:mm:ss"));
    }
}
