package FOR;
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n = sc.nextInt();
         
        int f =0;

        for(int i=2;i<n;i++){
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
