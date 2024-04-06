package ARRAY;
import java.util.*;

public class firstAndLastOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int k =7;
        int fstOcc = -1;
        int lstOcc = -1;
        int flag = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(k==arr[i] && flag==0){
                fstOcc = i;
                flag =1;
            }else if(k==arr[i]){
                lstOcc = i;
            }
        }

        System.out.println("first occurance is "+ fstOcc + " and last occurance is "+ lstOcc);

    }
}
