package ARRAY;
import java.util.*;

public class elePresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int k = 8;
        int idx = -1;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                idx = i;
                break;
            }
        }

        System.out.println("element is present at index: " + idx);

    }
}
