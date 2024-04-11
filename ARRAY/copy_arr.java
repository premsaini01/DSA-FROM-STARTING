package ARRAY;
import java.util.*;
public class copy_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("enter size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // new array
        int[] arr2 = new int[n];
 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr2[i] = arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
