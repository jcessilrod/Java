/*
    Calcula quantas polegadas cúbicas
    há em uma milha cúbica.
*/

public class Inches {
    public static void main(String[] args) {
        long cubicInches;
        long inchesPerMile;

        // calcula quantas polegadas há em uma linha
        inchesPerMile = 5280 * 12;

        // calcula o número de polegadas cúbicas
        cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;

        System.out.println("There are " + cubicInches +
                            " cubic inches in a cubic mile.");
    }
}