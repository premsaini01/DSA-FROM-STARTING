package PRATICE;

import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=5;i++){
            System.out.print("enter a num: ");
            int n = sc.nextInt();
            if(n>max){
                max = n;
            }
        }

        System.out.println(max);
    }
}
