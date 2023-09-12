import java.util.Scanner;

public class SumoffirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Write the number: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first natural numbers: "+sum);
        sc.close();
    }
}
