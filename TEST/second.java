package TEST;

public class second {
    public static void main(String[] args) {
        int n = 13;

        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        int a6 = 6;
        int a7 = 7;
        int a8 = 8;
        int a9 = 9;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==5 || i==9 || j==5 || j==9){
                    System.out.print("*");
                }else if((i==3 && j==3) || (i==3 && j==7) || (i==3 && j==11) || (i==7 && j==3) || (i==7 && j==7) || (i==7 && j==11) || (i==11 && j==3) || (i==11 && j==7) || (i==11 && j==11)){
                    System.out.print("");
                }else{
                    System.out.print(" ");
                }

                if(i==3 && j==3){
                    System.out.print(a1);
                }

                if(i==3 && j==7){
                    System.out.print(a2);
                }

                if(i==3 && j==11){
                    System.out.print(a3);
                }

                if(i==7 && j==3){
                    System.out.print(a4);
                }

                if(i==7 && j==7){
                    System.out.print(a5);
                }

                if(i==7 && j==11){
                    System.out.print(a6);
                }

                if(i==11 && j==3){
                    System.out.print(a7);
                }

                if(i==11 && j==7){
                    System.out.print(a8);
                }

                if(i==11 && j==11){
                    System.out.print(a9);
                }
            }
            System.out.println();
        }
    }
}
