package com.fujie.learn.week1;

/**
 * @ClassName Example3_8
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/17
 **/
public class Example3_8 {

    public static void main(String args[]){
        int a=1;
        int sum =0;
        for(int i=1;i<=20;i++){
            int j=i;
            while(j!=0){
                a=a*j;
                j=j-1;
            }
            sum=a+sum;
            a=1;
        }
        System.out.println(sum);
    }
}
