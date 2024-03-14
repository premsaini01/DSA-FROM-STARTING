package PATTERNS;

public class twelth {
    public static void main(String[] args) {
        int n =5;

        for(int i=1;i<=n;i++){

            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }

            if(i==1){
                for(int m=1;m<=n;m++){
                    System.out.print("*");
                }
            }

            for(int j=i;j<=i;j++){
                System.out.print("*");
            }

            for(int k=n-i;k<=n-1;k++){
                System.out.print(" ");
            }

            if(i!=1 || i!=n){
                for(int o=1;o<=1;o++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
