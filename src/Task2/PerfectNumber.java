package Task2;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(33550336));
    }

    private static boolean isPerfectNumber(int num) {
        boolean isPerfect = false;
        int result = 1;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        if (num == result) {
            isPerfect = true;
        }
        return isPerfect;
    }
}