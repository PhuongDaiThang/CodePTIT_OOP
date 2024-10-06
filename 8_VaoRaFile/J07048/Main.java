package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\phuon\\OneDrive - ptit.edu.vn\\Desktop\\CodePTIT_OOP\\8_VaoRaFile\\J07048\\SANPHAM.in");
        Scanner sc=new Scanner(file);
        ArrayList lst=new ArrayList<>();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            sc.nextLine();
            String id=sc.nextLine();
            String name=sc.nextLine();
            String price= String.valueOf(sc.nextInt());
            int warrity=sc.nextInt();
            Product p=new Product(id,name,price,warrity);
            lst.add(p);
        }
        Collections.sort(lst);
        for(Product p:lst){
            System.out.println(p);
        }
    }
}
