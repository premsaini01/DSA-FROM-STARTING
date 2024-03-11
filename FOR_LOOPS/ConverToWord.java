package ZERO;

import java.util.Scanner;

public class ConverToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int ans= 0;

        while(n>0){
            int d = n%10;
            ans = ans*10 +d;
            n/=10;
        }

        while(ans>0){
            int d = ans%10;
            ans/=10;

            switch (d) {
                case 1:
                    System.out.print("one" + " ");
                    break;
                case 2:
                    System.out.print("two" + " ");
                    break;
                case 3:
                    System.out.print("three" + " ");
                    break;
                case 4:
                    System.out.print("four" + " ");
                    break;
                case 5:
                    System.out.print("five" + " ");
                    break;
                case 6:
                    System.out.print("six" + " ");
                    break;
                case 7:
                    System.out.print("seven" + " ");
                    break;
                case 8:
                    System.out.print("eight" + " ");
                    break;
                case 9:
                    System.out.print("nine" + " ");
                    break;
                case 0:
                    System.out.print("zero" + " ");
                    break;
 
            }
        }
    }
}
