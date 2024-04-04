package ARRAY;

import java.util.Scanner;

public class printEvenAndOddIndexNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter value:");
        for(int i=0;i<arr.length;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.print("odd indexed number are: ");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.print("even indexed num are: ");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
