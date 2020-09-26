/*
    O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
    distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
    distribuidor seja de 28% e os impostos de 45%, faça um algoritmo que leia o custo de fábrica 
    de um carro e escreva o custo ao consumidor.
*/
import java.util.Scanner;

public class ExSequencial03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double custo_fabrica, custo_consumidor, perc_distribuidor, impostos;

        System.out.print("Digite o custo de fábrica do carro: ");
        custo_fabrica = input.nextDouble();

        perc_distribuidor = custo_fabrica * 0.28;
        impostos = custo_fabrica * 0.45;

        custo_consumidor = custo_fabrica + perc_distribuidor + impostos;

        System.out.printf("Custo de Fábrica: %.1f\nCusto ao Consumidor: %.1f\n", 
                            custo_fabrica, custo_consumidor);

        input.close();
    }
}