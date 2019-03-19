package Task3;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public void transpMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public double[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size N: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        return new double[n][m];
    }

    public String findAverageValues(double[][] matrix) {
        double sum = 0;
        double composition = 1;
        int quantityElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                composition *= matrix[i][j];
                quantityElements++;
            }
        }
        return "Arithmetic Average  is " + sum / quantityElements + "\n" +
                "Geometrical Average is " + Math.pow(composition, 1.0 / quantityElements);
    }

    public void initializationMatrix(double[][] matrix, int start, int finish) {
        Random randomValue = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (double) (start + randomValue.nextInt(finish - start));
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public String findExtremeValues(double[][] matrix) {
        double min = matrix[0][0];
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return "Min value: " + min + "\n" + "Max value: " + max;
    }

    public String findLocalMin(double[][] matrix) {
        int[] localMin = {-1, -1};
        double rightValue;
        double leftValue;
        double upValue;
        double downValue;
        for (int j = 1; j < matrix[0].length - 1; j++) {
            rightValue = matrix[0][j + 1];
            leftValue = matrix[0][j - 1];
            downValue = matrix[1][j];
            if (matrix[0][j] < rightValue &&
                    matrix[0][j] < leftValue &&
                    matrix[0][j] < downValue) {
                localMin[0] = 0;
                localMin[1] = j;
                System.out.println();
                return localMin[0] + "; " + localMin[1];
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            rightValue = matrix[i][1];
            downValue = matrix[i + 1][0];
            upValue = matrix[i - 1][0];
            if (matrix[i][0] < rightValue &&
                    matrix[i][0] < upValue &&
                    matrix[i][0] < downValue) {
                localMin[0] = i;
                localMin[1] = 0;
                System.out.println();
                return localMin[0] + "; " + localMin[1];
            }
        }
        for (int j = 1; j < matrix[0].length - 1; j++) {
            rightValue = matrix[matrix.length - 1][j + 1];
            leftValue = matrix[matrix.length - 1][j - 1];
            upValue = matrix[matrix.length - 2][j];
            if (matrix[matrix.length - 1][j] < rightValue &&
                    matrix[matrix.length - 1][j] < leftValue &&
                    matrix[matrix.length - 1][j] < upValue) {
                localMin[0] = matrix.length - 1;
                localMin[1] = j;
                System.out.println();
                return localMin[0] + "; " + localMin[1];
            }
        }
        for (int i = 1; i < matrix[0].length - 1; i++) {
            upValue = matrix[i + 1][matrix[0].length - 1];
            leftValue = matrix[i][matrix[0].length - 2];
            downValue = matrix[i - 1][matrix[0].length - 1];
            if (matrix[i][matrix[0].length - 1] < upValue &&
                    matrix[i][matrix[0].length - 1] < leftValue &&
                    matrix[i][matrix[0].length - 1] < downValue) {
                localMin[0] = i;
                localMin[1] = matrix[0].length - 1;
                System.out.println();
                return localMin[0] + "; " + localMin[1];
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 2; j++) {
                rightValue = matrix[i][j + 1];
                leftValue = matrix[i][j - 1];
                upValue = matrix[i - 1][j];
                downValue = matrix[i + 1][j];
                if (matrix[i][j] < rightValue &&
                        matrix[i][j] < leftValue &&
                        matrix[i][j] < upValue &&
                        matrix[i][j] < downValue) {
                    localMin[0] = i;
                    localMin[1] = j;
                    System.out.println();
                    return localMin[0] + "; " + localMin[1];
                }
            }
        }
        System.out.println();
        return "-1";
    }

    public String findLocalMax(double[][] matrix) {
        int[] localMax = {-1, -1};
        double rightValue;
        double leftValue;
        double upValue;
        double downValue;
        for (int j = 1; j < matrix[0].length - 1; j++) {
            rightValue = matrix[0][j + 1];
            leftValue = matrix[0][j - 1];
            downValue = matrix[1][j];
            if (matrix[0][j] > rightValue &&
                    matrix[0][j] > leftValue &&
                    matrix[0][j] > downValue) {
                localMax[0] = 0;
                localMax[1] = j;
                return localMax[0] + "; " + localMax[1];
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            rightValue = matrix[i][1];
            downValue = matrix[i + 1][0];
            upValue = matrix[i - 1][0];
            if (matrix[i][0] > rightValue &&
                    matrix[i][0] > upValue &&
                    matrix[i][0] > downValue) {
                localMax[0] = i;
                localMax[1] = 0;
                return localMax[0] + "; " + localMax[1];
            }
        }
        for (int j = 1; j < matrix[0].length - 1; j++) {
            rightValue = matrix[matrix.length - 1][j + 1];
            leftValue = matrix[matrix.length - 1][j - 1];
            upValue = matrix[matrix.length - 2][j];
            if (matrix[matrix.length - 1][j] > rightValue &&
                    matrix[matrix.length - 1][j] > leftValue &&
                    matrix[matrix.length - 1][j] > upValue) {
                localMax[0] = matrix.length - 1;
                localMax[1] = j;
                return localMax[0] + "; " + localMax[1];
            }
        }
        for (int i = 1; i < matrix[0].length - 1; i++) {
            upValue = matrix[i + 1][matrix[0].length - 1];
            leftValue = matrix[i][matrix[0].length - 2];
            downValue = matrix[i - 1][matrix[0].length - 1];
            if (matrix[i][matrix[0].length - 1] > upValue &&
                    matrix[i][matrix[0].length - 1] > leftValue &&
                    matrix[i][matrix[0].length - 1] > downValue) {
                localMax[0] = i;
                localMax[1] = matrix[0].length - 1;
                System.out.println();
                return localMax[0] + "; " + localMax[1];
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 2; j++) {
                rightValue = matrix[i][j + 1];
                leftValue = matrix[i][j - 1];
                upValue = matrix[i - 1][j];
                downValue = matrix[i + 1][j];
                if (matrix[i][j] > rightValue &&
                        matrix[i][j] > leftValue &&
                        matrix[i][j] > upValue &&
                        matrix[i][j] > downValue) {
                    localMax[0] = i;
                    localMax[1] = j;
                    return localMax[0] + "; " + localMax[1];
                }
            }
        }
        System.out.println(localMax[0] + "; " + localMax[1]);
        return "-1";
    }
}