/*
    Criar um algoritmo que informe a quantidade total de calorias de uma refeição a partir da escolha do usuário 
    que deverá informar o prato, a sobremesa e a bebida. Veja a tabela abaixo:

    PRATO                   SOBREMESA                   BEBIDA
    Vegetariano 180 kcal    Abacaxi 52 kcal             Chá 2 kcal
    Peixe 220 kcal          Sorvete Diet 110 kcal       Suco de laranja 128 kcal
    Frango 145 kcal         Mousse diet  99 kcal        Suco de abacaxi 100 kcal
    Carne 140 kcal          Mousse chocolate 300 kcal   Refrigerante 78 kcal
*/
import java.util.Scanner;

public class ExSwitch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha_prato_kcal = 0, escolha_sobremesa_kcal = 0, escolha_bebida_kcal = 0;
        int op_prato, op_sobremesa, op_bebida;

        String prato_nome = null, sobremesa_nome = null, bebida_nome = null;
        
        System.out.print("PRATO PRINCIPAL: ");
        System.out.println("1. Vegetariano 180 kcal - 2. Peixe 220 kcal - 3. Frango 145 kcal - 4. Carne 140 kcal");
        
        System.out.print("SOBREMESA: ");
        System.out.println("1. Abacaxi 52 kcal - 2. Sorvete Diet 110 kcal - 3. Mousse diet 99 kcal - 4. Mousse chocolate 300 kcal");
        
        System.out.print("BEBIDA: ");
        System.out.println("1. Chá 2 kcal - 2. Suco de laranja 128 kcal - 3. Suco de abacaxi 100 kcal - 4. Refrigerante 78 kcal");
        
        System.out.println();

        System.out.print("Digite o prato escolhido: "); op_prato = input.nextInt();
        System.out.print("Digite a sobremesa escolhida: "); op_sobremesa = input.nextInt();
        System.out.print("Digite a bebida escolhida: "); op_bebida = input.nextInt();

        switch (op_prato) {
            case 1:
                escolha_prato_kcal = 180;
                prato_nome = "Vegetariano";
                break;
            case 2:
                escolha_prato_kcal = 220;
                prato_nome = "Peixe";
                break;
            case 3:
                escolha_prato_kcal = 145;
                prato_nome = "Frango";
                break;
            case 4:
                escolha_prato_kcal = 140;
                prato_nome = "Carne";
                break;
        }

        switch (op_sobremesa) {
            case 1:
                escolha_sobremesa_kcal = 52;
                sobremesa_nome = "Abacaxi";
                break;
            case 2:
                escolha_sobremesa_kcal = 110;
                sobremesa_nome = "Sorvete diet";
                break;
            case 3:
                escolha_sobremesa_kcal = 99;
                sobremesa_nome = "Mousse diet";
                break;
            case 4:
                escolha_sobremesa_kcal = 300;
                sobremesa_nome = "Mousse chocolate";
                break;
        }

        switch (op_bebida) {
            case 1:
                escolha_bebida_kcal = 2;
                bebida_nome = "Chá";
                break;
            case 2:
                escolha_bebida_kcal = 128;
                bebida_nome = "Suco de laranja";
                break;
            case 3:
                escolha_bebida_kcal = 100;
                bebida_nome = "Suco de abacaxi";
                break;
            case 4:
                escolha_bebida_kcal = 78;
                bebida_nome = "Refrigerante";
                break;
        }

        System.out.println();

        System.out.printf("Refeição: [Prato: %s] [Sobremesa: %s] [Bebida: %s] - ", 
                            prato_nome, sobremesa_nome, bebida_nome);
        
        System.out.println("Total Kcal: " + 
                            (escolha_prato_kcal + escolha_bebida_kcal + escolha_sobremesa_kcal));

        input.close();
    }
}