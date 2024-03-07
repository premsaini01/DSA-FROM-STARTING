package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int count = 0;

        while (n>0) {
            count++;
            n/=10;
        }

        System.out.println(count);

    }
}
