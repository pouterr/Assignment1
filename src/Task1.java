import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Lenght of array
        System.out.println("How many elements?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Asking user to enter array
        System.out.println("Enter elements of array:");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr, arr.length);
        System.out.println("Minimum of array is "+min);


    }
    public static int findMin(int[] arr, int n){
        if(n==1){
            return arr[0];
        }else{
            int min = findMin(arr,n-1);
            return Math.min(min,arr[n-1]);
        }
    }
}
