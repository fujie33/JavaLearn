package com.fujie.learn.week2;

import java.util.Arrays;
import java.util.Random;
/**
 * @ClassName ArrayAction
 * @Description TODO
 * @Author 付洁
 * @Date 2020/10/6
 **/

public class ArrayAction {
    final static int MAX = 5;

    public static int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i : arr) {
            maxValue = Math.max(maxValue, i);
        }
        return maxValue;
    }

    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i : arr) {
            minValue = Math.min(minValue, i);
        }
        return minValue;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = new int[MAX];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i] + " ");
        }
        int minValue = getMin(array);
        int maxValue = getMax(array);
        int sum = minValue + maxValue;
        System.out.println("最大值" + minValue);
        System.out.println("最小值" + maxValue);
        System.out.println("最大值最小值之和是" + sum);
        bubbleSort(array);
        System.out.println("=========>数组现在各项为:" + Arrays.toString(array));
    }
}
