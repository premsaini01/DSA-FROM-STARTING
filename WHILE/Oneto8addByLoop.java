package WHILE;

import java.util.Scanner;

public class Oneto8addByLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int z =1;


        while(z<=n){
            System.out.println(z);
            z++;
        }
    }
}
