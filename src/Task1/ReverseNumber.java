package Task1;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 1234567;
        reverseNumber(number);
    }

    private static void reverseNumber(int number) {
        int lastNumber;
        String reverseNumber = "";
        while (number > 0) {
            lastNumber = number % 10;
            reverseNumber = reverseNumber + lastNumber;
            number = (number - lastNumber) / 10;
        }
        int newNumber = Integer.valueOf(reverseNumber);
        System.out.println(newNumber);
    }
}