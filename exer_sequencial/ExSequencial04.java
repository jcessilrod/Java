/*
    Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o 
    número de horas extras trabalhadas, calcule e mostre o salário a receber, seguindo as 
    regras abaixo:
    -   A hora trabalhada vale 1/8 do salário mínimo
    -   A hora extra vale ¼ do salário mínimo
    -   O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora 
        trabalhada
    -   A quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas 
        multiplicado pelo valor da hora extra
    -   O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras
*/
import java.util.Scanner;

public class ExSequencial04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num_hrs_trabalhadas, num_hrs_extras;
        double sal_minimo, val_hora_trabalhada, val_hora_extra, 
                sal_bruto, adicional, sal_liquido;
        
        System.out.print("Digite o número de horas trabalhadas: ");
        num_hrs_trabalhadas = input.nextInt();

        System.out.print("Digite o valor do salário mínimo: ");
        sal_minimo = input.nextDouble();

        System.out.print("Digite o número de horas extras: ");
        num_hrs_extras = input.nextInt();

        val_hora_trabalhada = sal_minimo / 8;
        val_hora_extra = sal_minimo / 4;

        sal_bruto = num_hrs_trabalhadas * val_hora_trabalhada;
        adicional = num_hrs_extras * val_hora_extra;

        sal_liquido = sal_bruto + adicional;

        System.out.printf("O salário a receber é %.1f\n", sal_liquido);

        input.close();
    }
}