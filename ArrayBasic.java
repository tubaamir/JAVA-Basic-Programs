//Initializing array using input from user

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        //taking size as input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //inititalizing an array
        int numbers[] = new int[size];
        //input
        for (int i=0; i<size; i++) {
            System.out.println("Enter values at index "+i+" = ");
            numbers[i] = sc.nextInt();
        }
        //output
        for (int i=0; i<size; i++) {
            System.out.println("Values at index "+i+" = "+numbers[i]);
        }
        sc.close(); 
    }
}
