/*
    Este programa converte galões em litros.
*/

public class GalToLit {
    public static void main(String[] args) {
        double gallons; // contém o número de galões
        double liters; // contém a conversão para litros

        gallons = 10;

        liters = gallons * 3.7854; // converte para litros

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}