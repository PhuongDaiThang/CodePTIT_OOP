package bai10;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("ONLINE.in"));
            int t = Integer.parseInt(sc.nextLine().trim());
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                String name = sc.nextLine().trim();
                String startTime = sc.nextLine().trim();
                String endTime = sc.nextLine().trim();
                Student student = new Student(name, startTime, endTime);
                students.add(student);
            }
            sc.close();

            Collections.sort(students);

            for (Student student : students) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (ParseException e) {
            System.out.println("Error parsing date.");
        }
    }
}