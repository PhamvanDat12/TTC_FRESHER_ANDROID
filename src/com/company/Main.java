package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int number, s = 0;
    private static List<Integer> arr = new ArrayList<>();

    public static void nhap() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập n :");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            number = sc.nextInt();
            arr.add(number);

        }
    }

    private static void xuLy() {

        for (int a : arr) {
            s += a;
        }
        System.out.println("Tổng là:" + s);

    }


    public static void main(String[] args) {
        nhap();
        xuLy();
    }
}
