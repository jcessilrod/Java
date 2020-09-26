/*
    Declara a variável de controle de laço dentro de for.
*/
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        // calcula a soma e o produto dos números de 1 a 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // i é conhecida em todo o laço
            product *= i;
        }

        // mas i não é conhecida aqui

        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
    }
}