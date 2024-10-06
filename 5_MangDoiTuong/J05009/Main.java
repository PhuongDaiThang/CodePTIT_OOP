package J05009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String doB = sc.nextLine();
            double point1 = sc.nextDouble();
            double point2 = sc.nextDouble();
            double point3 = sc.nextDouble();
            sc.nextLine();
            Student sv = new Student(i + 1, name, doB, point1, point2, point3);
            students.add(sv);
        }
        Collections.sort(students);
        double maxTotal = students.get(0).getTotal();
        for (Student x : students) {
            if(x.getTotal() == maxTotal) {
                System.out.println(x);
            }
        }
    }
}
