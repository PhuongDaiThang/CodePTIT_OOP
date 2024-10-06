package J05022;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<Student>();
        while (t-- > 0) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String email = sc.nextLine();
            students.add(new Student(msv, name, grade, email));
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String lop = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            List<Student> searchStudent = searchByClass(students, lop);
            if (!searchStudent.isEmpty()) {
                for (Student s : searchStudent) {
                    System.out.println(s);
                }
            }
        }
    }

    private static List<Student> searchByClass(List<Student> students, String lop) { // Sửa kiểu tham số
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade().equals(lop)) {
                result.add(student);
            }
        }
        return result;
    }
}
