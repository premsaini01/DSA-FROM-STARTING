package LOOPS;

import java.util.Scanner;

public class fibonaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the term: ");
        int n = sc.nextInt();

        int ft = 0;
        int st = 1;

        for(int i=1;i<=n;i++){
            System.out.println(ft);
            int tt = ft+st;
            ft= st;
            st= tt;
        }
    }
}
