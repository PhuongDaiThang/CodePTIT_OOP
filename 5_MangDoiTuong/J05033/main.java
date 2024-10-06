import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        List<Time>times=new ArrayList<Time>();
        for(int i=0;i<t;i++){
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            times.add(new Time(h,m,s));
        }
        Collections.sort(times);
        for(Time time:times){
            System.out.println(time);
        }
    }
}