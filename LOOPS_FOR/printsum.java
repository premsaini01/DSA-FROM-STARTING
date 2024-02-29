package LOOPS_FOR;

import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter starting range: ");
        int a = sc.nextInt();

        System.out.print("enter ending range: ");
        int b = sc.nextInt();

        int sum = 0;

        for(int i=a;i<=b;i++){
            sum+=i;
        }

        System.out.println(sum);
    }
}
