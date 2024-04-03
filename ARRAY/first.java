package ARRAY;

import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking n for "n" size of arr
        System.out.print("enter a size of array: ");
        int n = sc.nextInt();

        // creating array of "n" size
        int[] arr = new int[n];

        // initialising array using loop
        for(int i =0;i<arr.length;i++){
            System.out.print("enter value of " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        // printing arrays values
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
