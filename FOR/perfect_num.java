package FOR;

import java.util.Scanner;

public class perfect_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int n = sc.nextInt();

        int ans = 0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                ans+=i;
            }
        }

        if(ans==n){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
