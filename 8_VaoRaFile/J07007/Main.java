package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\phuon\\OneDrive - ptit.edu.vn\\Desktop\\CodePTIT_OOP\\8_VaoRaFile\\J07007\\VANBAN.in");
        Scanner sc=new Scanner(file);
        Set<String> set=new TreeSet<>();
        while(sc.hasNext()){
            String line= sc.next();
            String[] words=line.toLowerCase().split("s\\+");
            for(String word:words){
                if(!word.isEmpty()){
                    set.add(word);
                }
            }
        }
        for(String word:set){
            System.out.println(word);
        }
    }
}
