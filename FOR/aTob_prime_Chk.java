package FOR;

import java.util.Scanner;

public class aTob_prime_Chk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int n = sc.nextInt();

        System.out.print("enter second num: ");
        int m = sc.nextInt();

        for(int i=n;i<=m;i++){
            int f=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }

            if(f==0){
                System.out.print(i + " ");
            }
        }

    }
}
