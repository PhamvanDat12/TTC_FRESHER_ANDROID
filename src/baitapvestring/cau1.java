package baitapvestring;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        String chuoi;
        int doDai=0;
        char kytu ='a';
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập chuỗi: ");
        chuoi = sc.nextLine();




        for (int i = 0 ;i<chuoi.length();i++){
            if(chuoi.charAt(i) == kytu){
                doDai++;
            }


        }
        System.out.println("Số lần xuất hiện của ký tự "+ kytu + "trong chuoi" +chuoi + "="+ doDai);
        System.out.println("tại vị trí thứ"+chuoi.indexOf(kytu));

    }
}
