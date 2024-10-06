import java.util.Scanner;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String result=removeAll100(s);
            System.out.println(s.length()-result.length());
        }
    }

    private static String removeAll100(String s) {
        while(s.contains("100")){
            s=s.replaceAll("100","");
        }
        return s;
    }
}
