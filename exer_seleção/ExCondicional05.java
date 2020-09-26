/*
    Implemente um algoritmo para calcular quantos reais serão necessários para encher o tanque de um veículo para 
    se realizar uma viagem. O usuário deverá informar o tipo de combustível do veículo, o número total de km a ser 
    percorrido e o consumo médio do veículo. A tabela de preços dos combustíveis utilizada no cálculo é apresentada 
    abaixo:

    Combustível     Preço
    Gasolina        R$ 2,69
    Álcool          R$ 1,64
    Diesel          R$ 2,02
*/
import java.util.Scanner;

public class ExCondicional05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tipo_combustivel;
        double total_km, consumo_medio;
        double valor_total;

        System.out.print("Digite o tipo de combustível do veículo: ");
        tipo_combustivel = input.nextInt();

        System.out.print("Digite o número total de km a ser percorrido: ");
        total_km = input.nextDouble();

        System.out.print("Digite o consumo médio do veículo(por 1km): ");
        consumo_medio = input.nextDouble();

        if (tipo_combustivel == 1) {
            valor_total = (total_km / consumo_medio) * 2.69;
            System.out.println("O valor a pagar nesta corrida é " + valor_total);
        } else if (tipo_combustivel == 2) {
            valor_total = (total_km / consumo_medio) * 1.64;
            System.out.println("O valor a pagar nesta corrida é " + valor_total);
        } else if (tipo_combustivel == 3) {
            valor_total = (total_km / consumo_medio) * 2.02;
            System.out.println("O valor a pagar nesta corrida é " + valor_total);
        }

        input.close();
    }
}