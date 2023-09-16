// This program will calculate the power of any number

import java.util.Scanner;
public class CalcPower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("enter value of x :");
        int x = sc.nextInt();
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int ans = 1;

        //working
        if (x >= 0 && n == 0) {
            ans = 1;
        } else if ( x == 0 && n >= 1) {
            ans = 0;
        } else {
            for (int i=1; i<=n; i++) {
                ans = ans * x;
            }
        }
        System.out.println(ans);
        
        sc.close();
    }
}