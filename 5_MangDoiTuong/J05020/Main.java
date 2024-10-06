//package J05021;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        sc.nextLine();
//        List<Grade> lst=new ArrayList<>();
//        for(int i=0;i<t;i++){
//            String msv=sc.nextLine();
//            String name=sc.nextLine();
//            String grade=sc.nextLine();
//            String email=sc.nextLine();
//            lst.add(new Grade(msv,name,grade,email));
//        }
//        Collections.sort(lst);
//        for(Grade g:lst){
//            System.out.println(g);
//        }
//    }
//}
