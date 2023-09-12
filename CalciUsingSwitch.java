//This is a simple calculator using Switch case  

import java.util.Scanner;

public class CalciUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        //input operator
        System.out.println("Enter your choice:");
        System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Divide");
        int opp = sc.nextInt();

        //switch cases
        switch (opp) {
            case 1 : int add = a + b ;
            System.out.println("Addition of "+a+" and "+b+" are "+add);
            break;

            case 2 : int sub = a - b ;
            System.out.println("Subtraction of "+a+" and "+b+" are "+sub);
            break;

            case 3 : int mul = a * b ;
            System.out.println("Multiplication of "+a+" and "+b+" are "+mul);
            break;

            case 4 : int div = a / b ;
            System.out.println("Division of "+a+" and "+b+" are "+div);
            break;

            default : System.out.println("You have entered Wrong choice!");
            break;
        }

        sc.close();
    }
}
