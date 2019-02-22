package Task2;

import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        Random random = new Random();
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 1000; i++) {
            if (random.nextInt(2) == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Орел выпал " + heads + " раз, решка выпала " + tails + " раз");
    }
}