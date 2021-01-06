import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String command = input[1];

        int[][] matrix = new int[rows][rows];

        switch (command) {
            case "A":
                for (int i = 0; i < rows; i++) {
                    int first = 1;
                    first = first + i;
                    for (int j = 0; j < rows; j++) {
                        matrix[i][j] = first;
                        first = first + rows;
                    }
                }
                break;
            case "B":
                int second = 1;
                for (int col = 0; col < rows; col++) {
                    if (col % 2 == 0) {
                        for (int row = 0; row < rows; row++) {
                            matrix[row][col] = second++;
                        }
                    } else {
                        for (int row = rows - 1; row >= 0; row--) {
                            matrix[row][col] = second++;
                        }
                    }
                }
                break;

        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
