package TEST;

public class first {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int space = -1;

        for(int i=1;i<=n;i++){
            for(int j =1;j<=star;j++){
                System.out.print("*");
            }

            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=star && j!=n;j++){
                System.out.print("*");
            }

            star--;
            space+=2;
            System.out.println();
        }

        star = 2;
        space = n;

        for(int i=1;i<=n;i++){
            for(int j =2;j<=star;j++){
                System.out.print("*");
            }

            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=2;j<=star;j++){
                System.out.print("*");
            }

            star++;
            space-=2;
            System.out.println();
        }

    }
}
