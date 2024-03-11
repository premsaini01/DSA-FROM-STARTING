package WHILE_LOOPS;

import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();
        int og = n;
        int ogg = n;
        int c = 0;
        int ans = 0;

        while(n>0){
            c++;
            n/=10;
        }

        while(og>0){
            int d = og%10;
            ans+= Math.pow(d, c);
            og/=10;
        }


        if(ogg==n){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
