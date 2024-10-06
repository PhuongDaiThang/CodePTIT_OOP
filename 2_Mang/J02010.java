import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        interchangeSort(arr,n);
    }
    public static void interchangeSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
