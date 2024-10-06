package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String[] scores = sc.nextLine().trim().split("\\s+");
            double[] s = new double[scores.length];

            for (int j = 0; j < scores.length; j++) {
                s[j] = Double.parseDouble(scores[j]);
            }

            double avgS = calc(s);
            String rating = classify(avgS);
            students.add(new Student(i + 1, name, avgS, rating));
        }

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }

    private static String classify(double avgS) {
        if (avgS >= 9) {
            return "XUAT SAC"; // Xuất sắc
        } else if (avgS >= 8) {
            return "GIOI"; // Giỏi
        } else if (avgS >= 7) {
            return "KHA"; // Khá
        } else if (avgS >= 5) {
            return "TB"; // Trung bình
        } else {
            return "YEU"; // Yếu
        }
    }

    private static double calc(double[] s) {
        double total = s[0] * 2 + s[1] * 2;
        for (int i = 2; i < s.length; i++) {
            total += s[i];
        }
        return total / (s.length + 2);
    }
}
