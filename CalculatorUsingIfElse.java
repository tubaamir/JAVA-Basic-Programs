import java.util.Scanner;

public class CalculatorUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter econd number: ");
        int b = sc.nextInt();
        System.out.println("Enter operation you want to perform:");
        System.out.println("+\n-\n*\n/\n");
        String op = sc.next();
        if (op.equals("+")){
            int sum = a + b ;
            System.out.println(sum);
        } else if (op.equals("-")) {
            int diff = a - b ;
            System.out.println(diff); 
        } else if (op.equals("*")) {
            int mul = a * b ;
            System.out.println(mul);
        } else if (op.equals("/")) {
            int div = a / b ;
            System.out.println(div);
        } else {
            System.out.println("INVALID OPERATOR!");
        }

        sc.close();
    }
}
