package com.fujie.learn.week1;

import java.util.Arrays;

/**
 * @ClassName Example2_6
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/9
 **/
public class Example2_6 {
    public static  void main (String args[]){
        int [] a = { 10, 20, 30,40, 50, 60},b, c, d;
        b = Arrays.copyOf(a,10);
        System.out.println("数组 a 的各个元素中的值：");
        System.out.println(Arrays.toString(a));
        System.out.println("数组 b 的各个元素中的值：");
        System.out.println(Arrays.toString(b));
        c = Arrays.copyOfRange(a, 3, 5);
        System.out.println("数组 c 的各个元素中的值：");
        System.out.println(Arrays.toString(c));
        d = Arrays.copyOfRange(a,3,9);
        System.out.println("数组 d 的各个元素中的值：");
        System.out.println(Arrays.toString(d));
    }
}
