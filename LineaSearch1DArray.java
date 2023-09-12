//Linear Search
//search for a number x and print its index

import java.util.Scanner;

public class LineaSearch1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        System.out.println("Enter the number you want to search ");
        int x = sc.nextInt();
        int numbers[] = new int[size];
        for (int i=0; i<size; i++) {
            System.out.println("enter the value at index "+i+" = ");
            numbers[i] = sc.nextInt(); 
        }
        for (int i=0; i<numbers.length; i++) {
            if ( numbers[i] == x) {
                System.out.println("x found at index "+i);
            }
        }

        sc.close();
    }
}