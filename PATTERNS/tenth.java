package PATTERNS;

public class tenth {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            if(i==1 || i==2 || i==n){
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            }else{
                for(int l=1;l<=1;l++){
                    System.out.print("*");
                }

                for(int m=1;m<=i-2;m++){
                    System.out.print(" ");
                }

                for(int q=1;q<=1;q++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
