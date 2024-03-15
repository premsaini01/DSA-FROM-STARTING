package PATTERNS;

public class twenty {
    public static void main(String[] args) {
        int n =5;
        int st = 1;

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=st;j++){
                if(j==1 || j==st){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i<n){
                st++;
            }else{
                st--;
            }
        }
    }
}
