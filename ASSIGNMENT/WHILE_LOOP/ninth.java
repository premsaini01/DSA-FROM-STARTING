package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int l = n%10;
        int f = 0;

        while(n>0){
            int d = n%10;
            f=d;
            n/=10;
        }

        System.out.println("sum of first and last digit is " + (l+f));
    }
}
