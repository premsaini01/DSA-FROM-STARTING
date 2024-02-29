package LOOPS;

import java.util.*;

public class palendrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();
        int og = n;
        int ans = 0;

        while(n>0){
            int d = n%10;
            ans = (ans*10) +d;
            n = n/10;
        }

        if(og==ans){
            System.out.println("yes,it is a palendrome number");
        }else{
            System.out.println("no,it is not a palendrome number");
        }
    }
}
