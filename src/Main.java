import java.util.Scanner;

public class Main {

    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Create an array of the specified length
        int[] arr = new int[length];

        // Ask the user to enter the array elements
        System.out.print("Enter the array elements separated by space: ");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Return the array entered by the user
        return arr;
    }

    public static int getNumFromUser(){
        Scanner sc = new Scanner(System.in);
        //Asking user for a number
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nChoose which task you want to test?\n0.Exit program\n1.Task 1\n2.Task 2\n3.Task 3\n4.Task 4\n5.Task 5\n6.Task 6\n7.Task 7\n8.Task 8\n9.Task 9\n10.Task 10\n");
            int userChoice = sc.nextInt();
            int[] arr;
            int num;
            switch(userChoice){
                case 0:
                    System.out.println("Program finished");
                    return;
                case 1:
                    arr = getArrayFromUser();
                    int min = Task1.findMin(arr, arr.length);
                    System.out.println("Minimum of array is "+min);
                    break;
                case 2:
                    arr = getArrayFromUser();
                    double avg = Task2.findAvg(arr, arr.length);
                    System.out.println("Average of array is "+avg);
                    break;
                case 3:
                    num = getNumFromUser();
                    if (Task3.isPrime(num,2,0)>=1){
                        System.out.println("Composite");
                    }else{
                        System.out.println("Prime");
                    }
                    break;
                case 4:
                    num = getNumFromUser();
                    System.out.println("Factorial is "+Task4.findFactorial(num));
                    break;
                case 5:
                    num = getNumFromUser();
                    System.out.println(num+"th number of Fibonacci Sequence is "+Task5.findFibSeqNumb(num));
                    break;
                case 6:
                    System.out.print("Enter your number: ");
                    num = sc.nextInt();
                    System.out.print("Enter your degree to number: ");
                    int deg = sc.nextInt();
                    System.out.println("Your number in your chosen degree is "+Task6.findNumDegree(num,deg));
                    break;
                case 7:
                    arr = getArrayFromUser();
                    Task7.reverseArray(arr, 0, arr.length - 1);
                    System.out.print("Reversed array: ");
                    for (int i = 0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 8:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter your string: ");
                    String string = scanner.nextLine();//string input from user
                    char[] stringArr = string.toCharArray();//converting string to array consisting of chars
                    if (Task8.isDigit(stringArr, stringArr.length - 1, 0) > 0){
                        System.out.println("No");
                    }
                    else{
                        System.out.println("Yes");
                    }
                    break;
                case 9:
                    System.out.println("Enter two numbers:");//asking user input
                    int n = sc.nextInt();
                    int k = sc.nextInt();
                    int result = Task9.findBinomialCoefficient(n, k);
                    System.out.println(result);
                    break;
                case 10:
                    System.out.print("Input two numbers to find GCD of them: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("GCD(" + a + "," + b + ") = " + Task10.gcd(a,b));//output
                    break;
                }

            }
        }

    }
