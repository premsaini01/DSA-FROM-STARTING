package ARRAY;

import java.util.Scanner;

public class evenAndOddIndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int eISum = 0;
        int oIsum = 0;

        System.out.println("enter value:");
        for(int i=0;i<arr.length;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                eISum+=arr[i];
            }else{
                oIsum+=arr[i];
            }
        }

        System.out.println("sum of even index is " + eISum + " and sum of odd index is " + oIsum);
    }
}
