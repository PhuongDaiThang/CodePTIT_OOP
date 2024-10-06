package J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\phuon\\OneDrive - ptit.edu.vn\\Desktop\\CodePTIT_OOP\\8_VaoRaFile\\J07001\\DATA.in");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
