/*
    Este programa ilustra as diferenças entre int e double.
*/

public class Example3 {
    public static void main(String[] args) {
        int w;
        double x;

        w = 10; // atribui a w o valor 10
        x = 10.0; // atribui a x o valor 10,0
        
        System.out.println("Original value of w: " + w);
        System.out.println("Original value of x: " + x);
    
        System.out.println(); // exibe uma linha em branco

        w = w / 4;
        x = x / 4;

        System.out.println("w after division: " + w);
        System.out.println("x after division: " + x);
    }
}