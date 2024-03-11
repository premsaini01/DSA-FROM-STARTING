package WHILE;

import java.util.Scanner;

public class IncrementEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");

        int n = sc.nextInt();
        int ans = 0;
        int i =1;

        while(n>0){
            int d = n%10;
            int m = ((d+1)%10)*i;
            ans+=m;
            i*=10;
            n/=10;
        }

        System.out.println(ans);
    }
}
