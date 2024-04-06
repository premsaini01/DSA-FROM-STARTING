package ARRAY;
import java.util.*;

public class diffBtwLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("diff btw largest and smallest is: " + (max-min));

    }
}
