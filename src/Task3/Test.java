package Task3;

public class Test {
    public static void main(String[] args) {
        Matrix mat = new Matrix();

        double[][] matrix = {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {1, 5, 2, 1},
                {12, 14, 18, 19}};

        mat.printMatrix(matrix);
        mat.transpMatrix(matrix);
        mat.printMatrix(matrix);
        System.out.println(mat.findAverageValues(matrix));
        System.out.println(mat.findExtremeValues(matrix));
        System.out.println(mat.findLocalMin(matrix));
        System.out.println(mat.findLocalMax(matrix));
    }
}
