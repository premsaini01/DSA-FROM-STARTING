package ZERO;

import java.util.Scanner;

public class aTobStrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int a = sc.nextInt();

        System.out.print("enter second num: ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            int n =i;
            int ans=0;

            while(n>0){
                int d = n%10;
                int fact =1;

                for(int j=1;j<=d;j++){
                    fact*=j;
                }

                ans+=fact;
                n/=10;
            }

            if(ans==i){
                System.out.print(i + " ");
            }
        }
    }
}
