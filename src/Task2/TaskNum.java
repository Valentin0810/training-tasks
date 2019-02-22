package Task2;

import java.util.Scanner;

public class TaskNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Наибольшая цифра натурального числа: " + findHighestDigital(num));
        checkIsPalindrom(num);
        if (checkIsSimple(num)) {
            System.out.println("Число " + num + " простое");
        } else {
            System.out.println("Число " + num + " не простое");
        }
        System.out.println("Простые делители числа: " + findSimpleDevisor(num));
        System.out.println("НОД двух чисел: " + findGcd(50, 35));
        System.out.println("НОК двух чисел: " + findLcm(50, 35));
        System.out.println("Число содержит " + findDifferentDigits(num) + " различных цифр");
    }

    public static int findDifferentDigits(int num) {
        int count = 0;
        String string = Integer.toString(num);
        for (int i = 0; i < 10; i++) {
            if (string.contains(String.valueOf(i))) {
                count++;
            }
        }
        return count;
    }

    public static int findGcd(int num1, int num2) {
        if (num1 > 0 && num2 > 0)
            while (num1 != num2) {
                if (num1 > num2) {
                    num1 = num1 - num2;
                } else {
                    num2 = num2 - num1;
                }
            }
        return num1;
    }

    public static int findLcm(int num1, int num2) {
        return num1 / findGcd(num1, num2) * num2;
    }

    private static String findSimpleDevisor(int num) {
        String result = "";
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0 && checkIsSimple(i)) {
                result = result + " " + i;
            }
        }
        return result;
    }

    private static boolean checkIsSimple(int num) {
        boolean isSimple = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    private static void checkIsPalindrom(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int lastNum = num % 10;
            reverse = reverse * 10 + lastNum;
            num = (num - lastNum) / 10;
        }
        if (original == reverse) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }

    private static int findHighestDigital(int num) {
        int hiDig = 0;
        while (num > 0) {
            if (num % 10 > hiDig) {
                hiDig = num % 10;
            }
            num = num / 10;
        }
        return hiDig;
    }
}