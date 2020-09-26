/*
    O inesperado em uma promoção!
*/
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        // Não é necessário uma coerção porque o resultado já é elevado a int.
        i = b * b; // Certo. não é necessária uma coerção

        b = 10;
        b = (byte) (b * b); // coerção necessária

        System.out.println("i and b: " + i + " " + b);
    }
}
