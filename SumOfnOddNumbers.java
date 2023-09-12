//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;;
public class SumOfnOddNumbers {
    
    public static void Avg(int n) {
        for (int i=1;  i<=n; i +=2) {
            System.out.println(i);
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        Avg(a);
        sc.close();
    }
}