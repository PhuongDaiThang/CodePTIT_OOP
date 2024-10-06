package J05006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int id = 1;
        while(t-->0){
            String fullName = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            String thue = sc.nextLine();
            String dayStart = sc.nextLine();
            Employee employee = new Employee(id++, fullName, gender, dob, thue, dayStart, address);
            System.out.println(employee);
        }
    }
}