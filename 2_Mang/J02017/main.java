package J02017;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<n;i++){
            if(!stack.isEmpty() && (stack.peek()+a[i])%2==0){
                stack.pop();
            }
            else{
                stack.push(a[i]);
            }
        }
        System.out.println(stack.size());
    }
}
