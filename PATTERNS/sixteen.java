package PATTERNS;

public class sixteen {
    public static void main(String[] args) {
        int n=5;

        int st = 9;
        int sp = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }

            for(int k =1;k<=st;k++){
                if(i==1 || k==1 || k==st){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            st-=2;
            sp++;
            System.out.println();
        }
    }
}
