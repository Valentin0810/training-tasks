package Task1;

public class DinosaurMass {

    public static void main(String[] args) {
        double dinoMassInKg = 77500;
        massConverter(dinoMassInKg);
    }

    private static void massConverter(double dinoMassInKg) {
        double dinoMassInMilligrams = dinoMassInKg * 1000000;
        double dinoMassInGrams = dinoMassInKg * 1000;
        double dinoMassInTons = dinoMassInKg / 1000;
        System.out.println("Масса динозавра в миллиграммах: "
                + dinoMassInMilligrams + ", в граммах: " + dinoMassInGrams +
                ", в тоннах: " + dinoMassInTons);
    }
}