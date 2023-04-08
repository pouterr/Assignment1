public class Task7 {
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
