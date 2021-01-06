import java.util.Arrays;
import java.util.Scanner;

public class MaximalSun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int rows1 = Integer.parseInt(tokens[0]);
        int cols2 = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows1][];
        for (int i = 0; i < rows1 ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int rows = 0; rows < matrix.length-2; rows++) {
            for (int cols = 0; cols < matrix[0].length-2; cols++) {
                int sum = 0;
                sum += matrix[rows][cols] + matrix[rows][cols+1] + matrix[rows][cols+2];
                sum += matrix[rows+1][cols] + matrix[rows+1][cols+1] + matrix[rows+1][cols+2];
                sum += matrix[rows+2][cols] + matrix[rows+2][cols+1] + matrix[rows+2][cols+2];

                if (sum > maxSum){
                    maxSum = sum;
                    row = rows;
                    col = cols;
                }
            }
        }


        System.out.println("Sum = " + maxSum);
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
