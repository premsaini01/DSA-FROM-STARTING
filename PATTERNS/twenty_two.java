package PATTERNS;

public class twenty_two {
    public static void main(String[] args) {
        int n = 5;
        int st =1;
        int sp = 4 ;

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                if(j==1 || j==st){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            if(i<n){
                sp--;
                st++;
            }else{
                sp++;
                st--;
            }
            System.out.println();
        }
    }
}
