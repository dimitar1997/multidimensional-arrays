import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    private static Scanner scanner = new Scanner(System.in);
    private static int[][] getMatrix(int rows){
        int matrix[][] = new int[rows][];
        for (int i = 0; i < rows ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
    private static boolean isFound(int[][] matrix, int rows, int cols){
        boolean bg = false;
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                if (matrix[i][j] == num){
                    System.out.println(i + " " + j);
                    bg = true;
                }
            }
        }
        return bg;
    }
    public static void main(String[] args) {

        String[] tokens = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int [][] matrix = getMatrix(rows);
        boolean isFound = isFound(matrix, rows,cols);

        if (!isFound){
            System.out.println("not found");
        }
    }
}
