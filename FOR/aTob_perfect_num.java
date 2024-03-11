package FOR;

import java.util.Scanner;

public class aTob_perfect_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int n = sc.nextInt();

        System.out.print("enter second num: ");
        int m = sc.nextInt();

        for(int i=n;i<=m;i++){
            int ans = 0;

            for(int j=1;j<i;j++){
                if(i%j==0){
                    ans+=j;
                }
            }

            if(ans==i){
                System.out.print(i + " ");
            }
        }

    }
}
