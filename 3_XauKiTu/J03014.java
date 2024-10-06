import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        int max=Math.max(a.toString().length(),b.toString().length());
        String ans=a.add(b).toString();
        if(ans.length()<max){
            ans='0'+ans;
        }
        System.out.println(ans);
    }
}
