package ZERO;

import java.util.Scanner;

public class EvenOddSumDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the num of inputs: ");
        int n = sc.nextInt();

        int esum = 0;
        int osum = 0;

        for(int i=1;i<=n;i++){
            System.out.print("enter a num: ");
            int a = sc.nextInt();

            if(a%2==0){
                esum+=a;
            }else{
                osum+=a;
            }
        }

        System.out.println("your result is.......");

        System.out.println("even sum= " + esum);

        System.out.println("odd sum= " + osum);
    }
}
