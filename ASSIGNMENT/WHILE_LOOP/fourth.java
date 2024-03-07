package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int ecount = 0;
        int ocount = 0;

        while (n>0) {
            int d = n%10;

            if(d%2==0){
                ecount++;
            }else{
                ocount++;
            }
            n/=10;
        }

        System.out.println("ecount = " + ecount + " ocount = " + ocount);
    }
}
