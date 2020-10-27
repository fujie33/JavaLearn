package com.fujie.learn.week4;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/19
 **/
public class OverLoadTest {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static String sum(String s1, String s2){
        return s1 + s2;
    }

    public static int second(int i, int j) {
        return i + j;
    }
}
