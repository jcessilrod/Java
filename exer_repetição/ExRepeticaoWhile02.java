/*
    Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e (c)
    depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor
    do saldo deve ser atualizado.
*/
import java.util.Scanner;

public class ExRepeticaoWhile02 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner input = new Scanner(System.in);
        double saldo = 0;
        boolean condicao = true;

        while (condicao == true) {
            int op;

            System.out.println("Opções: ");
            System.out.println("(1) consulta saldo");
            System.out.println("(2) saque");
            System.out.println("(3) depósito");
            System.out.println("(4) sair");
            System.out.print("> "); 
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("");
                    System.out.println("Saldo: " + saldo);
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    double saque;
                    System.out.print("Digite o valor do saque: "); saque = input.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Não foi possivel realizar a transação. Saldo insuficiente.");
                        System.out.println("---------------------------------------------");
                    } else {
                        double saldo_historico = saldo;
                        saldo -= saque;
                        
                        System.out.printf("Saque efetuado com sucesso. Saldo anterior: %.2f - Saldo atual: %.2f\n", saldo_historico, saldo);
                        System.out.println("---------------------------------------------");
                    }
                    break;
                case 3:
                    double deposito;
                    System.out.print("Digite a quantia que deseja depósitar: "); deposito = input.nextDouble(); saldo += deposito;
                
                    System.out.println("Depósito efetuado com sucesso.");
                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    condicao = false;
                    System.out.println("---------------------------------------------");
                    break;
                default:
                    System.out.println("Opção digitada incorreta!");
                    input.close();
                    break;
            }
        }
    }
}