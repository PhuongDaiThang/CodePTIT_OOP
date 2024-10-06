import java.util.*;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            int sumleft=0;
            boolean flag=false;
            for (int i = 0; i < n; i++) {
                int sumright=sum-sumleft-arr[i];
                if(sumleft==sumright){
                    System.out.println(i+1);
                    flag=true;
                    break;
                }
                sumleft+=arr[i];
            }
            if(flag==false){
                System.out.println(-1);
            }
        }
    }
}
