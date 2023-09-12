import java.util.*;
public class 2DArrayBasic {
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
                //System.out.println("value at index "+i+" "+j+" = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("matrix is = ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}