package ASSIGNMENT.WHILE_LOOP;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int temp = n;
        int ans = 0;

        while(temp>0){
            int d = temp%10;
            ans = ans*10 +d;
            temp/=10;
        }
        
        if(n==ans){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
