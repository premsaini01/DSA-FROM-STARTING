package FOR;

import java.util.Scanner;

public class aTob_armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int a = sc.nextInt();

        System.out.print("enter second num: ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            int n = i;
            int og = i;
            int c = 0;
            int ans = 0;

            while(n>0){
                c++;
                n/=10;
            }

            while(og>0){
                int d = og%10;
                ans+= Math.pow(d, c);
                og/=10;
            }


            if(ans==i){
                System.out.print(i + " ");
            }
        }
    }
}
