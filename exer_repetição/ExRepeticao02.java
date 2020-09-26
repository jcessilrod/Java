/*
    Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
    média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
    negativos e o percentual de valores negativos e positivos.
*/
import java.util.Scanner;

public class ExRepeticao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma_valores = 0;
        int index, cont_pos = 0, cont_neg = 0;

        System.out.print("Digite o valor do index: "); index = input.nextInt();
        for (int i = 0; i < index; i++) {
            System.out.println("--------------------------------------------");
            System.out.print("Digite o valor: "); double valor = input.nextDouble();
            soma_valores += valor;

            if (valor > 0) {
                cont_pos += 1;
            } else if (valor < 0) {
                cont_neg += 1;
            }
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("A soma dos valores digitados é " + soma_valores);

        System.out.println("Foram contabilizados " + cont_pos + " números positivos.");
        System.out.println("Foram contabilizados " + cont_neg + " números positivos.");

        int perc_pos = cont_pos * 100 / index , perc_neg = cont_neg * 100 / index ;
        
        System.out.println("O percentual de números positivos é " + perc_pos + "%");
        System.out.println("O percentual de números negativos é " + perc_neg + "%");

        input.close();
    }
}