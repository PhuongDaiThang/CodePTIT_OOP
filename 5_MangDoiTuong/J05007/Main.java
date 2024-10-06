package J05007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Employee> EMP = new ArrayList<>();
        for(int i=0;i<t;i++) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dOB = sc.nextLine();
            String address = sc.nextLine();
            String taxID = sc.nextLine();
            String dayStart = sc.nextLine();
            Employee x = new Employee(i+1,name,gender,dOB,address,taxID,dayStart); 
            EMP.add(x);
        }
        Collections.sort(EMP);
        for(Employee x : EMP) {
            System.out.println(x);
        }
    }
}
