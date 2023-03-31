import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double avg = findAvg(arr, arr.length);
        System.out.println("Average of array is "+avg);
    }

    public static double findAvg(int[] arr, int n){
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + (n-1)*findAvg(arr, n-1)) / n;
        }
    }
}
