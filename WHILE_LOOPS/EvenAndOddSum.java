package WHILE_LOOPS;

import java.util.*;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");

        int n = sc.nextInt();

        int esum = 0;
        int osum = 0;

        while(n>0){
            int d = n%10;

            if(d%2==0){
                esum+=d;
            }else{
                osum+=d;
            }

            n/=10;
        }

        System.out.println("esum= " + esum + " osum= " +osum);
    }
}
