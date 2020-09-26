/*
    Faça um algoritmo para calcular a conta de energia elétrica de uma casa. O usuário deve digitar a quantidade de 
    kWh consumido no mês. O valor de um kWh é R$ 0,25. Entretanto, quando a casa é de uma pessoa aposentada, a conta 
    tem um desconto de 15%.
*/
import java.util.Scanner;

public class ExCondicional04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double qnt_kwh_mes, val_conta;
        int status;

        System.out.print("Digite a quantidade de kWh consumido no mês: ");
        qnt_kwh_mes = input.nextDouble();

        System.out.print("Status(1:aposentado - 2:normal): ");
        status = input.nextInt();

        if (status == 1) {
            double desconto = (qnt_kwh_mes * 0.25) * 0.15; 
            val_conta = qnt_kwh_mes * 0.25 - desconto;
            System.out.println("O valor da conta de energia elétrica é(-15%): " + val_conta);
        } else if (status == 2) {
            val_conta = qnt_kwh_mes * 0.25;
            System.out.println("O valor da conta de energia elétrica é: " + val_conta);
        }
        
        input.close();
    }
}