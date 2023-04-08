public class Task8 {
    public static int isDigit(char[] arr,int length,int counter){
        //checking if length remains greater than zero, not to go through array repeatedly
        if(length>0){
            if (Character.isDigit(arr[length])){
                counter = isDigit(arr, length - 1, counter);//if character is digit counter remains the same
            }
            else {
                counter = isDigit(arr, length - 1, counter + 1);//if character is not digit adding 1 to counter
            }
        }
        return counter;
    }
}
