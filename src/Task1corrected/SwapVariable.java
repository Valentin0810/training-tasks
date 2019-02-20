package Task1corrected;

import java.util.Scanner;

public class SwapVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a = " + a + ", b = " + b);
        swapVariables(a, b);
    }

    private static void swapVariables(int a, int b) {
        a = a + b - (b = a);
        System.out.println("a = " + a + ", b = " + b);
    }
}