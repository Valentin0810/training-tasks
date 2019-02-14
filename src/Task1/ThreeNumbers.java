package Task1;

public class ThreeNumbers {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
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