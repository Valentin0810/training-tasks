package Task1;

public class IncreasingSequence {

    public static void main(String[] args) {
        int number = 1357;
        int[] numbers = numberToArray(number);
        isIncreasingSequence(numbers);
    }

    private static int[] numberToArray(int number) {
        int[] numbers = {0, 0, 0, 0};
        int i = numbers.length - 1;
        while (number > 0) {
            int lastNumber = number % 10;
            numbers[i] = lastNumber;
            i--;
            number = (number - lastNumber) / 10;
        }
        return numbers;
    }

    private static void isIncreasingSequence(int[] numbers) {
        int j = 0;
        if ((numbers[j] < numbers[j + 1]) &&
                (numbers[j + 1] < (numbers[j + 2]) &&
                        (numbers[j + 2] < numbers[j + 3]))) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }
}