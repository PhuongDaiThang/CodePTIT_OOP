package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        List<Subjects> lst = new ArrayList<>();
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            int credit = sc.nextInt();
            Subjects s = new Subjects(id, name, credit);
            lst.add(s);
        }
        Collections.sort(lst);
        sc.close();
        for (Subjects s : lst) {
            System.out.println(s);
        }
    }
}
