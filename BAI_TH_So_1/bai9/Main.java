package bai9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("LUYENTAP.in"));
            int t = Integer.parseInt(sc.nextLine());
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                String name = sc.nextLine();
                String x = sc.nextLine();
                StringTokenizer st = new StringTokenizer(x);
                int numCorrect = Integer.parseInt(st.nextToken());
                int numSubmissions = Integer.parseInt(st.nextToken());
                Student student = new Student(name, numCorrect, numSubmissions);
                students.add(student);
            }
            Collections.sort(students);
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}