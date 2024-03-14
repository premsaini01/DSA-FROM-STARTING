package PATTERNS;

public class eleventh {
    public static void main(String[] args) {
        int n=5;
        int sp =0;

        for(int i=1;i<=n;i++){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }

            System.out.println();
            sp++;
        }
    }
}
