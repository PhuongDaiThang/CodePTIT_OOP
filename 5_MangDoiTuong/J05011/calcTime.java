import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class calcTime {
    public static void calc (){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        int n=sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String id=sc.nextLine();
            String name=sc.nextLine();
            LocalTime startTime=LocalTime.parse(sc.nextLine(), dtf);
            LocalTime endTime=LocalTime.parse(sc.nextLine(), dtf);
            employees.add(new Employee(id,name,startTime,endTime));
        }
        Collections.sort(employees,new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Long.compare(o2.getTotalMinutes(),o1.getTotalMinutes());
            }
        });
        for(Employee e: employees) {
            System.out.println(e);
        }
    }
}
