package SERIES;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int ans = 0;
        int p =1;

        while(n>0){
            ans = (n%2)*p + ans;
            n= n/2;
            p*=10;
        }

        System.out.println(ans);
    }
}
