package FOR;
import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the num of inputs: ");
        int n = sc.nextInt();

        int ecount = 0;
        int ocount = 0;
        int pos = 0;
        int neg = 0;

        for(int i=1;i<=n;i++){
            System.out.print("enter a num: ");
            int a = sc.nextInt();

            if(a%2==0){
                ecount++;
            }else{
                ocount++;
            }

            if(a>0){
                pos++;
            }else{
                neg++;
            }
        }

        System.out.println();

    }
}
