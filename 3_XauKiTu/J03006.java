import java.util.Scanner;

public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(tn(s) && even(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean tn(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        return rev.equals(s);
    }
    private static boolean even(String s) {
        return s.chars().allMatch(c ->(c-'0')%2==0);
    }
}
