package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        File file = new File("SV.in");
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = sc.nextDouble();
            Student sv = new Student(i + 1, name, grade, dob, gpa);
            System.out.println(sv);
        }
    }
}
