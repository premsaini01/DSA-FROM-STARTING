package WHILE_LOOPS;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();
        int ans = 0;

        while (n>0) {
            int d = n%10;
            ans+=d;
            n/=10;
        }

        System.out.println(ans);
    }
}
