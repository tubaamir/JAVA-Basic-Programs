import java.util.Scanner;

public class CalculatorUsingFunctions {
    public static void sumOfTwoNumbers(int a, int b) {
        int sum = a+b;
        System.out.println("Sum of two numbers are "+sum);
        return;
    }

    public static int subtractionOfTwoNumbers(int a, int b) {
        return a-b;
    }

    public static int multiplicationOfTwoNumbers (int a, int b) {
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int firstNo = sc.nextInt();
        int secondNo = sc.nextInt();
        sumOfTwoNumbers(firstNo, secondNo);
        System.out.println("Subtraction of two numbers are "+subtractionOfTwoNumbers(firstNo, secondNo));
        System.out.println("Multiplication of two numbers are "+multiplicationOfTwoNumbers(firstNo, secondNo));
        
        sc.close();
    }
}
