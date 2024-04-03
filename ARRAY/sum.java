package ARRAY;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking size of array
        System.out.print("enter a size of arr: ");
        int n = sc.nextInt();

        // creating a array of size "n"
        int[] arr = new int[n];

        // sum variable
        int sum =0;

        // initializing array
        for(int i=0;i<arr.length;i++){
            System.out.print("enter a value of  " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        // adding values in sum
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        // printing sum
        System.out.println(sum);
    }
}
