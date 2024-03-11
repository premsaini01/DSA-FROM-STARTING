package WHILE_LOOPS;

import java.util.*;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a num: ");

        int n = sc.nextInt();
        int ld = n%10;
        int d = 0;

        while(n>0){
            d= n%10;
            n/=10; 
        }

        int fd =d;

        int sum = fd+ld;
        System.out.println(sum);

    }
}
