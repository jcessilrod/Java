/*
    Você foi contratado por uma empresa de construção para fazer um algoritmo que calcule o salário 
    líquido dos operários no fim de cada mês, sabe-se que cada operário recebe R$ 3,00 por cada hora 
    trabalhada, e que se desconta 8% do salário bruto para o INSS. Desta forma, o usuário deverá 
    informar o número de horas trabalhadas de um operário e o algoritmo retornará o salário líquido 
    do operário.
*/
import java.util.Scanner;

public class ExSequencial02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num_horas;
        double sal_bruto, sal_liquido;

        System.out.print("Digite o número de horas trabalhadas: ");
        num_horas = input.nextInt();

        sal_bruto = num_horas * 3;
        sal_liquido = sal_bruto - (sal_bruto * 0.08);

        System.out.println("");
        
        System.out.printf("O número de horas trabalhadas é %d\n", num_horas);
        System.out.printf("O valor do salário líquido é %.2f\n", sal_liquido);
          
        input.close();
    }
}