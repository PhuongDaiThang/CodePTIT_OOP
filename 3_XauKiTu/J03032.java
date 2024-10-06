import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] words=s.split(" ");
            StringBuilder kq=new StringBuilder();
            for(int i=0;i<words.length;i++){
                kq.append(new StringBuilder(words[i]).reverse().toString());
                if(i<words.length-1){
                    kq.append(" ");
                }
            }
            System.out.println(kq.toString());
        }
    }
}
