import java.util.*;
public class check_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pre = 0;
        boolean flag = true;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            if(arr[pre]>arr[i]){
                flag = false;
                break;
            }
        }

        System.out.println(flag);

    }
}
