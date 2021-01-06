import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoMatrices {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char [][] matrix1 = getMatrix(rows,cols);
        char [][] matrix2 = getMatrix(rows, cols);

        char[][] matrix3 = creatMatrxi3(rows, cols, matrix1, matrix2);
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] creatMatrxi3(int rows, int cols, char matrix1 [][], char matrix2 [][]) {
        char[][] matrix3 = new char[rows][cols];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                char symbol = matrix1[i][j];
                if (matrix1[i][j] == matrix2[i][j]){
                    matrix3[i][j] = symbol;
                }else {
                    matrix3[i][j] = '*';
                }
            }
        }
        return matrix3;
    }

    private static char[][] getMatrix(int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] symbols = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = symbols[j].charAt(0);
            }
        }
        return matrix;
    }
}
