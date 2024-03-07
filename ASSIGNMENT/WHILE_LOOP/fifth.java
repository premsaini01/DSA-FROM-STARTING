package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        System.out.println(n);

        int ans = 0;

        while (n>0) {
            int d = n%10;
            ans = ans*10 +d;
            n/=10;
        }

        System.out.println("ans= " + ans);


    }
}
