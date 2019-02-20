package Task1corrected;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        identicalNumbers(firstNumber, secondNumber, thirdNumber);
    }

    private static void identicalNumbers(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.println("Все числа одинаковые");
        } else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Два числа из трех одинаковые");
        } else {
            System.out.println("Все числа разные");
        }
    }
}