package J03009;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Set<String> set1=new HashSet<>(Arrays.asList(s1.split(" ")));
            Set<String> set2=new HashSet<>(Arrays.asList(s2.split(" ")));
            set1.removeAll(set2);
            List<String> resultList = new ArrayList<>(set1);
            Collections.sort(resultList);
            for (String s : resultList) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
