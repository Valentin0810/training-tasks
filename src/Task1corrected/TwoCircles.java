package Task1corrected;

import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {
        checkData();
    }

    private static void checkData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиусы окружностей:");
        double radiusR1 = scanner.nextDouble();
        double radiusR2 = scanner.nextDouble();
        if (radiusR1 > radiusR2) {
            findAreaBtwCircles(radiusR1, radiusR2);
        } else {
            System.out.println("Проверьте исходные данные");
            while (radiusR1 <= radiusR2) {
                System.out.println("Введите еще раз радиусы окружностей:");
                radiusR1 = scanner.nextDouble();
                radiusR2 = scanner.nextDouble();
            }
            findAreaBtwCircles(radiusR1, radiusR2);
        }
    }

    private static void findAreaBtwCircles(double radiusR1, double radiusR2) {
        double areaRingBtwCircles = Math.PI * (radiusR1 * radiusR1 - radiusR2 * radiusR2);
        System.out.println("Площадь кольца равна " + areaRingBtwCircles);
    }
}