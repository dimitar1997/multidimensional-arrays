import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];
        int rowCols = 8;
        for (int i = 0; i < 8; i++) {
            String[] symbols = scanner.nextLine().split(" ");
            for (int j = 0; j < symbols.length; j++) {
                matrix[i][j] = symbols[j].charAt(0);

            }
        }

        for (int i = 0; i < rowCols; i++) {
            for (int j = 0; j < rowCols; j++) {
                char symbol = matrix[i][j];
                if (symbol == 'q') {
                    boolean check = true;
                    int index1 = i;
                    int index2 = j;
                    boolean stop = true;
                    while (stop) {
                        int counter = index2 + 1;
                        for (int k = index1 + 1; k < rowCols; k++) { //Rightdown
                            char ch1 = matrix[k][counter];
                            counter++;
                            if (ch1 == 'q') {
                                check = false;
                                stop = false;
                                break;
                            }
                        }
                        counter = 0;
                        counter = index2 + 1;
                        for (int k = index1 - 1; k >= 0 && counter < rowCols; k--) {//upRight
                            char ch2 = matrix[k][counter];
                            counter++;
                            if (ch2 == 'q') {
                                check = false;
                                stop = false;
                                break;
                            }

                        }
                        int counter2 = index2 - 1;
                        for (int k = index1 - 1; k >= 0 && counter2 >= 0; k--, counter2--) {//leftUp
                            char ch7 = matrix[k][counter2];
                            if (ch7 == 'q') {
                                check = false;
                                stop = false;
                                break;
                            }
                        }
                        int counter3 = index2 - 1;
                        for (int k = index1 + 1; k < rowCols && counter3 >= 0; k++, counter3--) { //leftDown
                            char ch8 = matrix[k][counter3];
                            if (ch8 == 'q') {
                                check = false;
                                stop = false;
                                break;
                            }
                        }
                        for (int k = index1 - 1; k >= 0; k--) {//centerUp
                            char ch3 = matrix[k][index2];
                            if (ch3 == 'q') {
                                check = false;
                                stop = false;
                                break;
                            }
                        }
                        for (int k = index1 + 1; k < rowCols; k++) {//centerDown
                            char ch4 = matrix[k][index2];
                            if (ch4 == 'q') {
                                check = false;
                                stop = false;
                                break;
                            }
                        }
                        for (int k = index1; k <= index1; k++) {//horizonRight
                            for (int l = index2 + 1; l < rowCols; l++) {
                                char ch5 = matrix[k][l];
                                if (ch5 == 'q') {
                                    check = false;
                                    stop = false;
                                    break;
                                }
                            }
                        }
                        for (int k = index1; k <= index1; k++) {//horizonLeft
                            for (int l = 0; l < index2; l++) {
                                char ch6 = matrix[k][l];
                                if (ch6 == 'q') {
                                    check = false;
                                    stop = false;
                                    break;
                                }
                            }
                        }
                        if (check) {
                            stop = false;
                        }
                    }
                    if (check) {
                        System.out.println(index1 + " " + index2);
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
