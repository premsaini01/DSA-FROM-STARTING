package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int max = n%10;
        int min = n%10;

        while(n>0){
            int d = n%10;

            if(d>=max){
                max =d;
            }else if(d<=min){
                min = d;
            }

            n/=10;
        }

        System.out.println("max: " + max + " min: " + min);
    }
}
