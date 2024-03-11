package ZERO;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first num: ");
        int n = sc.nextInt();

        System.out.print("enter a second num: ");
        int m = sc.nextInt();

        int hcf = 0;

        for(int i =1;i<=n && i<=m;i++){
            if(n%i==0 && m%i==0){
                hcf = i;
            }
        }

        System.out.println(hcf);
    }
}
