package ZERO;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        boolean flag = false;
        int z = 0;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                z = i;
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("it is perfect square of " + z);
        } else {
            System.out.println("it is not a perfect square");
        }
    }
}
