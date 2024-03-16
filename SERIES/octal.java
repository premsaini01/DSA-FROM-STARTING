package SERIES;

import java.util.Scanner;

public class octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();
        int ans = 0;
        int p = 1;

        while(n>0){
            ans = (n%8)*p + ans;
            p*=10;
            n/=8;
        }

        System.out.print(ans);
    }
}
