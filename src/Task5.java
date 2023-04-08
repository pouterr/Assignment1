public class Task5 {
    public static int findFibSeqNumb(int n){
        //0-th of fibo sequence is 0
        if(n == 0){
            return 0;
        //1-th of fibo sequence is 1
        } else if (n==1) {
            return 1;
        }else{
            //addition of previous number and n-2 number
            int result = findFibSeqNumb(n-1)+ findFibSeqNumb(n-2);
            return result;
        }
    }
}
