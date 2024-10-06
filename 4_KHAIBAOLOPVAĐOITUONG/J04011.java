//import java.util.Scanner;
//
//class Point {
//    private int x;
//    private int y;
//    private int z;
//
//    public Point(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getZ() {
//        return z;
//    }
//
//    public void setZ(int z) {
//        this.z = z;
//    }
//}
//
//class Check {
//    Point a, b, c, d;
//
//    public Check(int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3, int a4, int b4, int c4) {
//        a = new Point(a1, a2, a3);
//        b = new Point(b1, b2, b3);
//        c = new Point(c1, c2, c3);
//        d = new Point(a4, b4, c4);
//
//        int[][] matrix = {
//                {a.getX(), a.getY(), a.getZ(), 1},
//                {b.getX(), b.getY(), b.getZ(), 1},
//                {c.getX(), c.getY(), c.getZ(), 1},
//                {d.getX(), d.getY(), d.getZ(), 1}
//        };
//
//        if (isCoplanar(matrix)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//
//    private boolean isCoplanar(int[][] matrix) {
//        double det = determinant(matrix);
//        return Math.abs(det) < 1e-10;
//    }
//
//    private double determinant(int[][] matrix) {
//        return matrix[0][0] * determinant3x3(matrix, 0, 0)
//                - matrix[0][1] * determinant3x3(matrix, 0, 1)
//                + matrix[0][2] * determinant3x3(matrix, 0, 2)
//                - matrix[0][3] * determinant3x3(matrix, 0, 3);
//    }
//
//    private double determinant3x3(int[][] matrix, int row, int col) {
//        int[][] subMatrix = new int[3][3];
//        int r = 0, c = 0;
//
//        for (int i = 0; i < 4; i++) {
//            if (i == row) continue;
//            c = 0;
//            for (int j = 0; j < 4; j++) {
//                if (j == col) continue;
//                subMatrix[r][c] = matrix[i][j];
//                c++;
//            }
//            r++;
//        }
//
//        return subMatrix[0][0] * (subMatrix[1][1] * subMatrix[2][2] - subMatrix[1][2] * subMatrix[2][1])
//                - subMatrix[0][1] * (subMatrix[1][0] * subMatrix[2][2] - subMatrix[1][2] * subMatrix[2][0])
//                + subMatrix[0][2] * (subMatrix[1][0] * subMatrix[2][1] - subMatrix[1][1] * subMatrix[2][0]);
//    }
//}
//
//public class J04011 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            Check test = new Check(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//            System.out.println();
//
//        }
//    }
//}
