import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Asking user for a number
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }

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
