import java.util.*;
public class menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;;i++){
            System.err.println("enter the choice:--");
            System.out.println("press 1 for insertion");
            System.out.println("press 2 for deletion");
            System.out.println("press 3 for search");
            System.out.println("press 4 for quit");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("enter index: ");
                    int idx = sc.nextInt();
                    System.out.println("enter element to insert: ");
                    int ele = sc.nextInt();
                    arr = insertion(arr, idx, ele);
                    display(arr, n);
                    break;
                case 2:
                    System.out.println("enter index: ");
                    idx = sc.nextInt();
                    deletion(arr, idx, n);
                    break;
                case 3:
                    System.out.println("enter element to search: ");
                    ele = sc.nextInt();
                    search(arr, ele);
                    break;

                case 4:
                    break;
                default:
                    System.out.println("you entered wrong input");
            }
        }
    }

    public static void display(int[] arr,int n){
        System.out.println("-------------------");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] insertion(int[] arr,int idx,int ele){
        int[] ans = new int[arr.length+1];
        for(int j=0;j<idx;j++){
            ans[j] = arr[j];
        }-
        for(int i=idx+1;i<ans.length;i++){
            ans[i] = arr[i-1];
        }

        ans[idx] = ele;

        return ans;
    }

    public static void deletion(int[] arr,int idx,int n){
        for(int i=idx;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        n--;
        display(arr, n);
    }

    public static void search(int[] arr,int ele){
        System.out.println("-------------------");
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                idx = i;
            }
        }

        System.out.println(ele + " is present at index: " + idx);
        System.out.println("-------------------");
    }
}
