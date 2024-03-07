package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();
        int t = n;
        int m = n;
        int c = 0;

        int ans = 0;

        while(m>0){
            c++;
            m/=10;
        }

        while(t>0){
            int d = t%10;
            int p = (int) Math.pow(d, c);
            ans+=p;
            t/=10;
        }

        if(n==ans){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
