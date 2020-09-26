/*
    Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que 
    receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência. 
    Calcule e mostre:
        a) o valor de cada quilowatt
        b) o valor a ser pago por essa residência
        c) o valor a ser pago com desconto de 15%
*/
import java.util.Scanner;

public class ExSequencial01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double val_sal_minimo, val_unit_quilowatt, val_pagar_total, val_pagar_desconto;
        int qnt_quilowatts;

        System.out.print("Digite o valor do salário mínimo: ");
        val_sal_minimo = input.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        qnt_quilowatts = input.nextInt();

        val_unit_quilowatt = val_sal_minimo / 5; // a
        val_pagar_total = qnt_quilowatts * val_unit_quilowatt; // b
        val_pagar_desconto = val_pagar_total - (val_pagar_total * 0.15); // c

        System.out.println("o valor de cada quilowatt é " + val_unit_quilowatt);
        System.out.println("o valor a ser pago por essa residência é " + val_pagar_total);
        System.out.println("o valor a ser pago com desconto de 15% é " + val_pagar_desconto);

        input.close();
    }
}