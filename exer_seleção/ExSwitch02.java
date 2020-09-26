/*
    Faça um programa que receba duas notas, calcule e mostre a média aritmética e mensagem que está na tabela 
    a seguir:

    Média Aritmética    Mensagem
    0,0 – 4,0           Reprovado
    4,1 – 7,0           Exame
    7,1 – 10,0          Aprovado
*/
import java.util.Scanner;

public class ExSwitch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, media;
        int result;

        System.out.print("Digite a primeira nota: "); nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: "); nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media <= 4) result = 0;
        else if (media > 4 && media <= 7) result = 1;
        else result = 2;

        switch (result) {
            case 0:
                System.out.printf("Reprovado(nota. %.1f)\n", media);
                break;
            case 1:
                System.out.printf("Exame(nota. %.1f)\n", media);
                break;
            case 2:
                System.out.printf("Aprovado(nota. %.1f)\n", media);
                break;
            default:
                System.out.println("Oops... Alguma coisa deu errado."); 
        }

        input.close();
    }
}