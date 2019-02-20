package Task1corrected;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        findAverageArithmetic(number);
        findAverageGeometrical(number);
    }

    private static void findAverageGeometrical(int number) {
        int composition = 1;
        double averageGeometrical;
        int quantityOfNumbers = 0;
        while (number > 0) {
            int lastNumber = number % 10;
            composition *= lastNumber;
            number = (number - lastNumber) / 10;
            quantityOfNumbers++;
        }
        averageGeometrical = Math.pow(composition, 1.0 / quantityOfNumbers);
        System.out.println(averageGeometrical);
    }

    private static void findAverageArithmetic(int number) {
        int sum = 0;
        double averageArithmetic;
        int quantityOfNumbers = 0;
        while (number > 0) {
            int lastNumber = number % 10;
            sum += lastNumber;
            number = (number - lastNumber) / 10;
            quantityOfNumbers++;
        }
        averageArithmetic = (double) sum / quantityOfNumbers;
        System.out.println(averageArithmetic);
    }
}