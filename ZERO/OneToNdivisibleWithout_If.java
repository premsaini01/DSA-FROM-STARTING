package ZERO;

import java.util.Scanner;

public class OneToNdivisibleWithout_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter anum: ");
        int n = sc.nextInt();

        for(int i=6;i<=n;i=i+6){
            System.out.println(i);
        }
    }
}
