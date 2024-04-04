package ARRAY;

import java.util.Scanner;

public class countPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos = 0;
        int neg = 0;

        System.out.println("enter value:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }

        System.out.println("Positive num: " + pos + " and Negative num: " + neg);
    }
}
