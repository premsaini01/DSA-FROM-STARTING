package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();
        int m = n;

        System.out.println(n);
        int c = 0;
        int f = 0;

        int l = n%10;

        while(n>0){
            f = n%10;
            c++;
            n/=10;
        }

        int t = m%(int)(Math.pow(10, c-1));
        int fstch = l*((int)Math.pow(10, c-1)) +t;

        int lstch = fstch/10;
        int ans = lstch*10 +f;

        System.out.println("ans: " + ans);


    }
}
