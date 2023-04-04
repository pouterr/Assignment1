import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Asking user for a number
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        System.out.print("Enter your degree to number: ");
        int n = sc.nextInt();
        System.out.println(findNumDegree(a,n));
    }

    public static int findNumDegree(int a,int n){
        //Return 1 when degree is 0
        if(n==0){
            return 1;
        }else{
            int result = findNumDegree(a,n-1) * a;
            return result;
        }
    }
}
