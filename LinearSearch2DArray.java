import java.util.*;
public class LinearSearch2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Matrix = ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        
        //input
        System.out.println("Enter the values ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search = ");
        int x = sc.nextInt();
        
        //output
        System.out.println("matrix is = ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {   
                if (matrix[i][j] == x) {
                    System.out.print("The number you searched for is at indexes = "+i+" "+j+" ");
                }
            }
        }
        sc.close();
    }
}