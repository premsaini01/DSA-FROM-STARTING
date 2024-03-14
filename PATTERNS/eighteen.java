package PATTERNS;

public class eighteen {
    public static void main(String[] args) {
        int n = 5;

        int sp =-1;
        int st = n;


        for(int i=1;i<=n;i++){

            for(int j=1;j<=st;j++){
                System.out.print("*");
            }

            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=st && j!=n;j++){
                System.out.print("*");
            }

            st--;
            sp+=2;
            System.out.println();
        }
    }
}
