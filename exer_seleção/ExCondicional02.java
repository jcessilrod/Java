/*
    Faça um algoritmo para resolver equações do 2º grau.
    
    ax2 + bx + c = 0       OBS: A variável a deve ser diferente de zero

    delta < 0 – não existe raiz real
    
    delta = 0 – existe uma raiz real
    x = -b / (2 * a)
    
    delta > 0 – existem duas raízes reais
    x1 = ( - b +  raiz(delta) ) / ( 2 * a )
    x2 = ( - b -  raiz(delta)) / ( 2 * a )
*/
import java.util.Scanner;

public class ExCondicional02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double delta, x, x1, x2;

        System.out.print("Digite o valor de a(deve ser diferente de zero): ");
        a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = input.nextDouble();

        delta = Math.pow(a, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existe raiz real!");
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("Existe uma raiz real. O valor de x é " + x);
        } else if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.printf("Existem duas raízes reais. O valor de x1 é %.1f e o valor de x2 é %.1f\n", x1, x2);
        } else {
            System.out.println("Oops... Algo deu errado!");
        }

        input.close();
    }
}