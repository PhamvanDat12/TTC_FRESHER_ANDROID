package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    private static Scanner sc = new Scanner(System.in);



    private void hienThi(int[] ht) {
        for (int i = 0; i < ht.length; i++) {
            System.out.println(ht[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("mời nhập vào số phần tử của mảng");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Mời nhập vào phần tử của mảng");
        for(int i=0;i<n;i++){
            System.out.println("a[%d] = "+i);
            a[i] = sc.nextInt();

        }



    }
}
