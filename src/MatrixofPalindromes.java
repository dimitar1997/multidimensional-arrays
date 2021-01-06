import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            int num = 97 + i;
            char symbol = (char) num;
            int counter = 0;
            for (int j = 0; j < cols ; j++) {
                String goToMatrix= "";
                for (int k = 0; k < 3 ; k++) {
                    if (k == 1){
                        int num2 = num + counter;
                        char symbol2 = (char) num2;
                        counter++;
                        goToMatrix = goToMatrix + symbol2;
                    }else {
                        goToMatrix = goToMatrix + symbol;
                    }
                }
                matrix[i][j] = goToMatrix;
            }
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
