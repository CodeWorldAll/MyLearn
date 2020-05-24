package com.william.java.learn.sort;

/**
 * @author xuwenxue
 * Created on 2020-05-24
 */
public class BubblingSort {

    private static void sort(int a[]) {
        int length = a.length;
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                int tmp = a[j];
                if (a[j] > a[j + 1]) {
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    private static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int a[] = {4, 2, 3, 1, 0};

        print(a);
        sort(a);
        print(a);
    }
}
