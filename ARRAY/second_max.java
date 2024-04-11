import java.util.*;
public class second_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }else if(arr[i]>smax){
                smax = arr[i];
            }
        }

        System.out.println(max + " " + smax);
    }
}
