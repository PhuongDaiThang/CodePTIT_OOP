package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DN.in");
        Scanner sc=new Scanner(file);
        List<Company> lst=new ArrayList<>();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            sc.nextLine();
            String id=sc.nextLine();
            String name=sc.nextLine();
            int number=sc.nextInt();
            Company cmp=new Company(id,name,number);
            lst.add(cmp);
        }
        Collections.sort(lst);
        for(Company cmp:lst){
            System.out.println(cmp);
        }
    }
}
