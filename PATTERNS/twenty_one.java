package PATTERNS;

public class twenty_one {
    public static void main(String[] args) {
        int n = 5;
        int st =1;
        int sp = 4 ;

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=st;j++){
                System.out.print("*");
            }

            if(i<n){
                st++;
                sp--;
            }else{
                st--;
                sp++;
            }

            
            System.out.println();
        }
    }
}
