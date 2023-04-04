import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//input a and b from user
        int b = sc.nextInt();
        int result = gcd(a,b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);//output
    }

    public static int gcd(int a, int b){
        //if b is zero then GCD is a
        if (b == 0) {
            return a;
        }
        //compute GCD of b and the remainder of a divided by b
        else {
            return gcd(b, a % b);
        }
    }
}
