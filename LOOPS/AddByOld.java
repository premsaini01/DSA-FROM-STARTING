package LOOPS;

import java.util.Scanner;

public class AddByOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int n = sc.nextInt();

        System.out.print("Enter second num: ");
        int m = sc.nextInt();

        int carry = 0;
        int num = 0;
        int p = 1;

        while (n>0 && m>0) {
            int x = n%10;
            int y = m%10;

            int z = x+y+carry;

            num = (z%10)*p + num;

            carry = z/10;

            n/=10;
            m/=10;
            p*=10;
        }

        num = carry*p + num;

        System.out.println(num);

    }
}
