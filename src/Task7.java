import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Asking user for array length and array elements
        System.out.print("Enter your array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n - 1);
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        //if the start index is greater than or equal to the end index the array is already reversed
        if (start >= end) {
            return;
        }
        //swap the elements at the start and end, and recursively reverse rest of the array
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
}
