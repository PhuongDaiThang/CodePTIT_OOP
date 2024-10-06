import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            System.out.println(solve(name));
        }
    }
    public static String solve(String name){
        String[] words=name.toLowerCase().split("\\s");
        StringBuilder builder=new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                builder.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        return builder.toString().trim();
    }
}
