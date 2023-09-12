import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter firdt number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
            
        if ( a > b ) {
            System.out.println("a is greater.");
        } else if ( a < b ) {
            System.out.println("a is smaller.");
        } else {
            System.out.println("equal");
        }
        
        sc.close();
    }
}