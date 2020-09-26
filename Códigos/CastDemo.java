/*
    Demonstra a coerção.
*/
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        // Ocorrerá truncamento nesta conversão
        i = (int) (x / y); // faz a coerção de double para int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; // Não há perda de informações aqui. Um byte pode conter o valor 100.
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // Desta vez há perda de informações. Um byte não pode conter o valor 257.
        System.out.println("Value of b: " + b);

        b = 88; // código ASCII para X
        ch = (char) b; // faz coerção de byte para char
        System.out.println("ch: " + ch);
    }
}