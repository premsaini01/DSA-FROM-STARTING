package FOR;


import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter starting range: ");
        int a = sc.nextInt();

        System.out.print("enter ending range: ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}
