import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] tokens = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        
        String[][] matrix =new String[rows][];
        for (int i = 0; i < rows ; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
        while (true){
            String[] tokens1 = scanner.nextLine().split(" ");
            String command = tokens1[0];
            if (command.equals("END")) break;
            if (matrix.length == 0) {
                System.out.println("Invalid input!");
                break;
            }
            if (command.equals("swap")){
                int firstIndex1 = Integer.parseInt(tokens1[1]);
                int firstIndex2 = Integer.parseInt(tokens1[2]);
                int secondIndex1 = Integer.parseInt(tokens1[3]);
                int secondIndex2 = Integer.parseInt(tokens1[4]);
                if (check(rows,cols, firstIndex1, firstIndex2, secondIndex1, secondIndex2)){
                    String firstSwap = matrix[firstIndex1][firstIndex2];
                    String secondSwap = matrix[secondIndex1][secondIndex2];

                    matrix[firstIndex1][firstIndex2] = secondSwap;
                    matrix[secondIndex1][secondIndex2] = firstSwap;
                    for (int i = 0; i <rows ; i++) {
                        for (int j = 0; j <cols ; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                }else {
                    System.out.println("Invalid input!");
                }

            }else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static boolean check(int rows,int cols, int firstIndex1, int firstIndex2, int secondIndex1, int secondIndex2) {
        boolean check = true;
        if (firstIndex1 < 0 ||  firstIndex1 > rows || firstIndex2 < 0 || firstIndex2 > cols
        || secondIndex1 < 0 || secondIndex1 > rows || secondIndex2 < 0 || secondIndex2 > cols){
            check = false;
        }
        return check;
    }
}
