package com.fujie.learn.week1;

/**
 * @ClassName Example3_9
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/15
 **/
public class Example3_9 {
    public static void main(String[] args) {
        int sum = 0, i, j;
        for (j = 2; j <= 100; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0) ;

            }
            if (i > j / 2) {
                System.out.println("" + j + "是素数");
            }
        }
    }
}
