package com.fujie.learn.week2;

import java.util.Random;

/**
 * @ClassName ArraryTest
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/5
 **/
public class ArraryTest {
    final  static  int MAX = 5;
    public static void main(String[] args) {
        int[] a = new int[MAX];
        Random random = new Random();
        for(int i = 0; i<MAX; i++){
            a[i] = random.nextInt( 100);
            System.out.println(a[i] + " ");
        }

    }
}
