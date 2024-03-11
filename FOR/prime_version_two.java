package FOR;

import java.util.Scanner;

public class prime_version_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int sqrt = (int)(Math.sqrt(n));
        int f =0;

        for(int i=2;i<=sqrt;i++){
            if(n%i==0){
                f=1;
                break;
            }
        }

        if(f==1){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
