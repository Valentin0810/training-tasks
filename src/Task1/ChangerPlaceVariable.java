package Task1;

public class ChangerPlaceVariable {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        a = a + b - (b = a);
        System.out.println(a + " " + b);
    }
}