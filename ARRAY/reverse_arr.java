import java.util.Arrays;

public class reverse_arr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        int st = 0;
        int end = arr.length-1;

        while (st<end) {
            int t = arr[st];
            arr[st] = arr[end];
            arr[end] = t;

            st++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
