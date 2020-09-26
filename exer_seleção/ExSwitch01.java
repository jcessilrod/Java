/*
    Elabore um algoritmo que leia dois valores do usuário e a operação que ele deseja executar (Operações: soma, 
    subtração, divisão, multiplicação). Execute a operação desejada e imprima na tela.
*/
import java.util.Scanner;

public class ExSwitch01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double val1, val2;

        System.out.print("Digite o primeiro valor: ");
        val1 = input.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        val2 = input.nextDouble();

        System.out.print("Digite o tipo de operação(1.soma, 2.subtração, 3.divisão e 4.multiplicação): ");
        int op = input.nextInt();

        switch (op) {
            case 1:
                System.out.printf("A soma dos números %.1f e %.1f é %.1f\n", val1, val2, (val1 + val2));
                break;
            case 2:
                System.out.printf("A subtração dos números %.1f e %.1f é %.1f\n", val1, val2, (val1 - val2));
                break;
            case 3:
                System.out.printf("A divisão dos números %.1f e %.1f é %.1f\n", val1, val2, (val1 / val2));
                break;
            case 4:
                System.out.printf("A multiplicação dos números %.1f e %.1f é %.1f\n", val1, val2, (val1 * val2));
                break;
            default:
                System.out.println("Ops... Alguma coisa aconteceu...");
        }

        input.close();       
    }
}