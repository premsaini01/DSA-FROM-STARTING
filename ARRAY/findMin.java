package ARRAY;
import java.util.*;

public class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }

        System.out.println("max element is: " + arr[max] + " is at index: " + max);
    }
}
