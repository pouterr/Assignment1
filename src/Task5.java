import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Asking user for a number
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(findFiboSeqNum(n));
    }

    public static int findFiboSeqNum(int n){
        //0-th of fibo sequence is 0
        if(n == 0){
            return 0;
        //1-th of fibo sequence is 1
        } else if (n==1) {
            return 1;
        }else{
            //addition of previous number and n-2 number
            int result = findFiboSeqNum(n-1)+findFiboSeqNum(n-2);
            return result;
        }
    }
}
