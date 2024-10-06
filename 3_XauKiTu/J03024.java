import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(!kt(s)){
                System.out.println("INVALID");
                continue;
            }
            if((utc(s) &&dc(s)) ||(utl(s) &&dl(s))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean dc(String s) {
        int chan=0;
        int le=0;
        for(char c : s.toCharArray()){
            int digit=c-'0';
            if(digit%2==0){
                chan++;
            }
            else{
                le++;
            }
        }
        return chan>le;
    }
    private static boolean dl(String s) {
        int chan=0;
        int le=0;
        for(char c : s.toCharArray()){
            int digit=c-'0';
            if(digit%2==0){
                chan++;
            }
            else{
                le++;
            }
        }
        return le>chan;
    }

    private static boolean utc(String s) {
        return(s.length()%2==0);
    }
    private static boolean utl(String s) {
        return(s.length()%2!=0);
    }


    private static boolean kt(String s) {
        return s.matches("\\d+");
    }
}
