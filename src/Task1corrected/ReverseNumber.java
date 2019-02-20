package Task1corrected;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        reverseNumber(number);
    }

    private static void reverseNumber(int number) {
        String reverseNumber = "";
        while (number > 0) {
            int lastNumber = number % 10;
            reverseNumber = reverseNumber + lastNumber;
            number = (number - lastNumber) / 10;
        }
        int newNumber = Integer.valueOf(reverseNumber);
        System.out.println(newNumber);
    }
}