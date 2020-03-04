package bai3_list;

import java.util.*;
import java.util.stream.Collectors;

public class Main1 {
   private static List<Bill> bills = new ArrayList<>();
    private static Scanner sc  = new Scanner(System.in);
        private static void input(){
        int n ;
        System.out.println("Nhập vào số phần tử:");
        n = sc.nextInt();
        for (int i=0;i<n;i++){
            Bill bill = new Bill();
            System.out.println("Id = ");
            bill.id = sc.nextInt();
            System.out.println("Name =");
            sc.next();
            bill.name =sc.nextLine();
            System.out.println("Money = ");
            bill.money = sc.nextLong();
            System.out.println("Date =");
            sc.next();
            bill.date =sc.nextLine();
           bills.add(bill);

        }

    }
    private static void cau5(){
           Bill bill = new Bill();
    }
    public static void main(String[] args) {
        input();
        Collections.sort(bills, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                if (o1.money > o2.money){
                    return  1;
                }else {
                    if (o1.money == o2.money){
                        return  0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        System.out.println("Danh sách Money sau khi sắp xếp là:");
        for (int i = 0; i < bills.size(); i++) {
            System.out.println("Money: " + bills.get(i).money);
        }
       bills = bills.stream().distinct().collect(Collectors.toList());
      for (int i = 0; i < bills.size(); i++) {
           System.out.println("Date: " + bills);
     }

        cau5();

        Set<Bill> bil = bills.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Bill::getDate))));
        bil.forEach(s -> System.out.println(s.date));
        for (int i= 0 ;i< bil.size();i++){
            System.out.println("distinct ngày lập hóa đơn" +bil.toString());
        }

    }
}
