import java.util.Scanner;
public class AddMatrices{
    public static void main(String args[]){
        int m1,n1,m2,n2;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of the first matrix (separated by a space): ");
        m1=scan.nextInt();
        n1=scan.nextInt();
        System.out.println("Enter the size of the second matrix (separated by a space): ");
        m2=scan.nextInt();
        n2=scan.nextInt();
        if ((m1==m2)&&(n1==n2)){
            int[][] matrix1 = new int[m1][n1];
            for (int i = 0; i < matrix1.length; i++) {
                System.out.println("Enter the values for row number "+(i+1)+"for matrix 1:");
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix1[i][j]=scan.nextInt();
                }
            }
            int[][] matrix2 = new int[m2][n2];
            for (int i = 0; i < matrix1.length; i++) {
                System.out.println("Enter the values for row number "+(i+1)+"for matrix 2:");
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix2[i][j]=scan.nextInt();
                }
            }
            int[][] result = new int[m1][n1];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Result:");
            printMatrix(result);
        } else {
            System.out.println("Invalid matrices size\n");
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}