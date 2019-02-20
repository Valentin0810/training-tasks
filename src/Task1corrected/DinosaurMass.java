package Task1corrected;

import java.util.Scanner;
public class DinosaurMass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу динозавра:");
        double dinoMassInKg = scanner.nextDouble();
        convertMass(dinoMassInKg);
    }

    private static void convertMass(double dinoMassInKg) {
        double dinoMassInMilligrams = dinoMassInKg * 1000000;
        double dinoMassInGrams = dinoMassInKg * 1000;
        double dinoMassInTons = dinoMassInKg / 1000;
        System.out.println("Масса динозавра в миллиграммах: "
                + dinoMassInMilligrams + ", в граммах: " + dinoMassInGrams +
                ", в тоннах: " + dinoMassInTons);
    }
}