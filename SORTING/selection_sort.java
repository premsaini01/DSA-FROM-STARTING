package SORTING;

import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        selection_sort(create_arr());
    }
    // create array
    public static int[] create_arr(){
        Scanner sc = new Scanner(System.in);
        System.err.print("enter a size of arr: ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // selection sort

    public static void selection_sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int idx =0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    idx = j;
                }
            }
            if(arr[idx]<arr[i]){
                int t = arr[i];
                arr[i] = arr[idx];
                arr[idx] = t;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    
}
