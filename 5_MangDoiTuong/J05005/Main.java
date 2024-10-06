package J05005;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String fullName = sc.nextLine();
            String grade = sc.nextLine();
            Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
            float gpa = Float.parseFloat(sc.nextLine());
            Student sv = new Student(i + 1, fullName, grade, birthday, gpa);
            sv.chuanhoa();
            students.add(sv);
        }
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}