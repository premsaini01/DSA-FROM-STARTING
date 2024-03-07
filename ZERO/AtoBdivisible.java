package ZERO;

import java.util.Scanner;

public class AtoBdivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int a = sc.nextInt();

        System.out.print("enter second num: ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            if(i%6==0){
                System.out.print(i + " ");
            }
        }
    }
}
