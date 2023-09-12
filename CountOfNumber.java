//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class CountOfNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sizeof array   ");
        int size = sc.nextInt();
        int arr1[] = new int[size];

        //input array
        for (int i=0; i<size; i++) {
            arr1[i] = sc.nextInt();
        }
        //diplaying array 
        for (int i=0; i<size; i++) {
            System.out.print(arr1[i]+" ");
        }

        for (int i=0; i<size; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 0;
            } else if (arr1[i] < 0) {
                arr1[i] = -1;
            } else if (arr1[i] > 0) {
                arr1[i] = 1;
            }
        }
        System.out.println("\n");
        for (int i=0; i<size; i++) {
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
