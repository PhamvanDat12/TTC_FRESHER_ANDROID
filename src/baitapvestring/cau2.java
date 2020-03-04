package baitapvestring;

import java.util.*;

public class cau2  {

    private static List<String> vitriChuoi;
    private static List<String> traVe = new ArrayList<>();
    private static List<String> xuLy(String chuoi){
        vitriChuoi = new ArrayList<>();
        int n = chuoi.length();
        for (int i =n-1;i>=0;i--){
            chuoi(chuoi.charAt(i));
        }
        return vitriChuoi;
    }
    private static void chuoi(char c){
        if(vitriChuoi.size()==0){
            vitriChuoi.add(String.valueOf(c));
        }else{
            Iterator<String> it =vitriChuoi.iterator();
            String tg ;
            while (it.hasNext()){
                tg = it.next();
                for (int k = 0 ;k< tg.length();k++){
                    StringBuilder stringBuilder = new StringBuilder(tg);
                    stringBuilder.insert(k,c);
                    traVe.add(stringBuilder.toString());
                }
            }
            vitriChuoi = traVe;
            traVe = new ArrayList<>();

        }
    }
    private static void joinChuoi(){
        List<String> noiChuoi1  = new ArrayList<>();
        List<String> noiChuoi2 = new ArrayList<>();
        String st1 = "";
        String tr2 ="";

        noiChuoi1.add("Abcbbc");
        noiChuoi1.add("Bcd");
        noiChuoi1.add("bds");

        for ( String s: noiChuoi1) {

            st1 += s +","+s;
            noiChuoi2.add(s);

        }
        System.out.println("Nối chuỗi :"+st1);

        //tách ra
        System.out.println("Tách chuỗi");
        String[] tach = st1.split(",");
        for (String ss: tach) {
            System.out.println(ss);
        }

    }
    private static void cau5(){
        String raw ="i am fresher";
        String from ="fresher";
        String to ="senior";

        String thaythe = raw.replace("fresher",from);
        String thaythe1 = raw.replace(from,"");
        String chuoiMoi= thaythe1.concat(to);
        System.out.println(chuoiMoi);
    }


    public static void main(String[] args) {
//        String chuoi ;
//        String[] catChuoi;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("mời nhập vào 1 chuỗi");
//        chuoi = sc.nextLine();
//        catChuoi = chuoi.split("");
        List<String> strins = xuLy("abcd");
        System.out.println("chuoi được xử lý là"+ strins.size());
        Iterator<String> it = strins.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
       joinChuoi();
       cau5();

    }


}
