public class Task4 {
    public static int findFactorial(int n){
        //0!=1
        if(n==0){
            return 1;
        }else{
            //multiplication of n and number before it
            int result = findFactorial(n-1)*n;
            return result;
        }
    }
}
