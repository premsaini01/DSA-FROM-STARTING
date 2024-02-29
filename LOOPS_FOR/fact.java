package LOOPS_FOR;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i =1;i<=n;i++){
            fact*=i;
        }

        System.out.println(fact);
    }
}
