package Task2;

public class FriendlyNumber {
    public static void main(String[] args) {
        System.out.println(isFriendlyNumber(220, 284));
        findFriendlyNumber(200, 1300);
    }

    private static void findFriendlyNumber(int start, int end) {
        if (start > end) {
            start = start + end - (start = end);
        } else {
            for (int i = start; i <= end; i++) {
                for (int j = i + 1; j <= end; j++) {
                    if (isFriendlyNumber(i, j)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

    private static boolean isFriendlyNumber(int num1, int num2) {
        boolean isFriendly = false;
        int sumDivisor1 = 0;
        int sumDivisor2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sumDivisor1 += i;
            }
        }
        for (int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                sumDivisor2 += j;
            }
        }
        if (num2 == sumDivisor1 && num1 == sumDivisor2) {
            isFriendly = true;
        }
        return isFriendly;
    }
}