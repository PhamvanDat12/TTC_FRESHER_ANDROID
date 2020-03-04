package baitapvedatevasimpledate;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class cau1 {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static Date date;

    private static void date() {
        date = new Date();
        String chuyen = simpleDateFormat.format(date);
        System.out.println(chuyen);
    }

    private static void cau2() throws ParseException {
        LocalDate localDate = LocalDate.now();
        System.out.println("Ngày của tháng : " + localDate.getDayOfMonth());
        System.out.println("Tháng: " + localDate.getMonth());
        System.out.println("Năm: " + localDate.getYear());

        System.out.printf("Ngày đầu tuần của tháng: %s%n",
                localDate.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println("ngày của tháng: " + tomorrow.getDayOfMonth());
    }

    private static void cau3() throws ParseException {
        String ngay1 = "20/10/2019";
        String ngay2 = "10/09/2018";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ngay1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(ngay2);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        System.out.println(cal1.after(cal2));
        int sosanh = date1.compareTo(date2);
        if (sosanh > 0) {
            System.out.println(date1 + "không lớn hơn" + date2);
        } else {
            System.out.println(date1 + "Lớn hơn" + date2);
        }
    }

    private static void cau4() throws ParseException {
        String ngay1;
        String ngay2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập ngày tháng năm theo dang dd/MM/yyyy");
        ngay1 = sc.nextLine();
        System.out.println("Moi nhập ngày tháng năm theo dạng dd/MM/yyyy");
        ngay2 = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = simpleDateFormat.parse(ngay1);
        Date date2 = simpleDateFormat.parse(ngay2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        long tinh = date2.getTime() - date1.getTime();
        long getDays = tinh / (24 * 60 * 60 * 1000);
        System.out.println("khoảng ngày của a và b " + getDays);
//        System.out.println("khoảng tháng của a và b " + getThang );
//        System.out.println("khoảng cách năm của a và b là:" + getNam + "năm");
    }

    private static void cau5() throws ParseException {
//      String date = "yyyy-MM-dd HH:mm:ss.SSS";
//
//      Date date1 = simpleDateFormat.parse(date);

        Date date = new Date();
        System.out.println("Ngày hiện tại:" + date);
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(timestamp);

        //Chuyển timeStap sang date
        Date last = new Date(timestamp.getTime());
        System.out.println(last);
    }

    private static void cau6() {
    }

    private static void cau7() {
        Date date = new Date();
        System.out.println("Ngày hiện tại:" + date);
        String date1 = DateFormat.getInstance().format(date);
        System.out.println("chuyển đổi định dạng:" + date1);
        String dateToStr = DateFormat.getDateTimeInstance().format(date);
        System.out.println("Chuyển đổi định dạng: " + dateToStr);
    }

    public static void main(String[] args) throws ParseException {
////        date();
////        cau3();
////        cau4();
////        cau5();
//        cau7();
        cau2();

    }
}
