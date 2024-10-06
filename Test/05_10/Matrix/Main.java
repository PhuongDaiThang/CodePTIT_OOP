package Matrix;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("MATRIX.in"));
        int testCases = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < testCases; t++) {
            String[] firstLine = br.readLine().trim().split(" ");
            int N = Integer.parseInt(firstLine[0]);
            int M = Integer.parseInt(firstLine[1]);
            int i = Integer.parseInt(firstLine[2]) - 1;

            Matrix matrix = new Matrix(N, M);
            String[] elements = br.readLine().trim().split(" ");
            int index = 0;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    matrix.setElement(r, c, Integer.parseInt(elements[index++]));
                }
            }
            matrix.sortColumn(i);
            System.out.println(matrix);
        }
        br.close();
    }
}