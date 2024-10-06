import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m=sc.nextInt();
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        Integer[]result=set.toArray(new Integer[0]);
        Arrays.sort(result);
        for(int i:result){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

