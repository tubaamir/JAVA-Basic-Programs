//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;;
public class GreatestNoUsingFunctions {
    
    public static void Avg(int m, int n) {
        if (m > n) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        Avg(a, b);
        sc.close();
    }
}