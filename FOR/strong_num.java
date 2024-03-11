package FOR;

import java.util.Scanner;

public class strong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ennter a num: ");
        int n = sc.nextInt();
        int m = n;

        int ans=0;

        while(n>0){
            int d = n%10;
            int fact =1;

            for(int i=1;i<=d;i++){
                fact*=i;
            }

            ans+=fact;
            n/=10;
        }

        if(m==ans){
            System.out.print("yes");
        }else{
            System.out.println("no");
        }
    }
}
