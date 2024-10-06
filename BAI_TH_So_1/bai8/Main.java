package bai8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("DANHSACH.in");
            Scanner sc = new Scanner(file);
            ArrayList<Student> students = new ArrayList<>();

            while (sc.hasNextLine()) {
                String id = sc.nextLine().trim();
                String name = sc.nextLine().trim();
                String grade = sc.nextLine().trim();
                String email = sc.nextLine().trim();
                String phone = sc.nextLine().trim();
                students.add(new Student(id, name, grade, email, phone));
            }
            sc.close();

            Collections.sort(students);

            for (Student student : students) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}