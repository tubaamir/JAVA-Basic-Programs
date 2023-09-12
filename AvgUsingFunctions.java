//Enter 3 numbers from the user & make a function to print their average

import java.util.Scanner;;
public class AvgUsingFunctions {
    
    public static void Avg(int x, int y,  int z) {
        int avg = (x+y+z)/3;
        System.out.println(avg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Avg(a, b, c);
        sc.close();
    }
}