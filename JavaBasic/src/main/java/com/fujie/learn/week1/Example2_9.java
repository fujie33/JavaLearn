package com.fujie.learn.week1;

/**
 * @ClassName Example2_9
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/14
 **/
enum Weekday{
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}
public class Example2_9 {
    public static void main(String[] args) {
        Weekday x = Weekday.星期日;
        if(x==Weekday.星期日){
            System.out.println(x);
            System.out.println("今天星期日");
        }
    }
}
