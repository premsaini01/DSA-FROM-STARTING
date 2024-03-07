package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();
        System.out.println(n);

        int ans = 0;
        int rev = 0;
        int c = 0;

        while(n>0){
            int d = n%10;
            int m = (d+1)/10;
            c = (d+1)%10;
            rev = rev*10 + (m) + c;
            n/=10;
        }

        while(rev>0){
            int d = rev%10;
            ans = ans*10 +d;
            rev/=10;
        }

        System.out.println("ans: "+ ans );
    }
}
