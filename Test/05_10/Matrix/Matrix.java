package Matrix;

import java.util.Arrays;

public class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void setElement(int row, int col, int value) {
        this.data[row][col] = value;
    }

    public void sortColumn(int colIndex) {
        Integer[] column = new Integer[rows];
        for (int i = 0; i < rows; i++) {
            column[i] = data[i][colIndex];
        }
        Arrays.sort(column);
        for (int i = 0; i < rows; i++) {
            data[i][colIndex] = column[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
