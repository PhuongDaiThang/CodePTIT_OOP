package J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Grade> lst = new ArrayList<>();
        while (sc.hasNextLine()) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String email = sc.nextLine();
            lst.add(new Grade(msv, name, grade, email));
        }
        Collections.sort(lst);
        for (Grade g : lst) {
            System.out.println(g);
        }
    }
}

