import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Asking user for a number
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        //Printing out result of isPrime function
        if (isPrime(n,2,0)>=1){
            System.out.println("Composite");
        }else{
            System.out.println("Prime");
        }
    }

    public static int isPrime(int n,int divider,int counter){
        //As divider starts from 2 it checks for n=1 and n=2
        if(n==divider || n<divider){
            return counter;
        }else{
            if(n%divider==0){
                return counter+1;
            }else{
                //Checking with next divider by adding 1
                return isPrime(n,divider+1,counter);
            }
        }
    }

}
