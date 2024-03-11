package FOR;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int n = sc.nextInt();

        System.out.print("enter second num: ");
        int m = sc.nextInt();

        for(int i=1;i<=n*m;i++){
            if(i%n==0 && i%m==0){
                System.out.print(i);
                break;
            }
        }
    }
}
