public class Task2 {
    public static double findAvg(int[] arr, int n){
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + (n-1)*findAvg(arr, n-1)) / n;
        }
    }
}
