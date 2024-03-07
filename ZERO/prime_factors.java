package ZERO;

import java.util.Scanner;

public class prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int sqrt = (int)(Math.sqrt(n));

        for(int i=1;i<=n;i++){
            if(n%i==0){
                int f = 0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        f=1;
                        break;
                    }
                }

                if(f==0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
