package Task1;

public class TwoCircles {

    public static void main(String[] args) {
        double radiusR1 = 2.5;
        double radiusR2 = 2;
        if (radiusR1 > radiusR2) {
            findAreaBtwCircles(radiusR1, radiusR2);
        } else {
            System.out.println("Проверьте исходные данные");
        }
    }

    private static void findAreaBtwCircles(double radiusR1, double radiusR2) {
        double areaFirstCircle = radiusR1 * radiusR1 * Math.PI;
        double areaSecondCircle = radiusR2 * radiusR2 * Math.PI;
        double areaRingBtwCircles = areaFirstCircle - areaSecondCircle;
        System.out.println("Площадь кольца равна " + areaRingBtwCircles);
    }
}