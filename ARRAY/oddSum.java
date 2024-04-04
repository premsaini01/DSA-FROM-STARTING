package ARRAY;
import java.util.*;
public class oddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int oSum = 0;

        System.out.println("enter value:");
        for(int i=0;i<arr.length;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oSum+=arr[i];
            }
        }

        System.out.println(oSum);

    }
}
