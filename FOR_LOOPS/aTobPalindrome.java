package ZERO;

import java.util.Scanner;

public class aTobPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int a = sc.nextInt();

        System.out.print("enter second num: ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            int n = i;
            int ans = 0;

            while(n>0){
                int d = n%10;
                ans = (ans*10) +d;
                n = n/10;
            }

            if(ans==i){
                System.out.print(i + " ");
            }
        }
    }
}
