import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1;x<=t;x++) {
            System.out.println("Test "+x+":");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int num : arr) {
                cnt.put(num, cnt.getOrDefault(num, 0) + 1);
            }
            Set<Integer> printed = new HashSet<>();
            for (int i : arr) {
                if (!printed.contains(i)) {
                    System.out.println(i + " xuat hien " + cnt.get(i) + " lan");
                    printed.add(i);
                }
            }
        }
    }
}
