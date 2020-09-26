/*
    Elaborar um algoritmo que leia 3 valores a,b,c e verifica se eles formam ou não um triângulo. Supor que os valores 
    lidos são inteiros e positivos. Caso os valores formem um triângulo, mostrar de que tipo ele é : escaleno, 
    eqüilátero ou isósceles. Se não formam um triângulo, mostrar uma mensagem: não forma um triângulo. OBS: Para ser 
    um triângulo têm que ser verdadeiro as seguintes condições:  (a < b + c)   e  ( b < c + a)  e  ( c < a + b)
*/
import java.util.Scanner;

public class ExCondicional03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c;

        System.out.print("Digite o valor de 'a': ");
        a = input.nextDouble();

        System.out.print("Digite o valor de 'b': ");
        b = input.nextDouble();

        System.out.print("Digite o valor de 'c': ");
        c = input.nextDouble();

        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            if (a != b && a != c && b != c) { // escaleno
                System.out.println("O valores formam um triângulo escaleno.");
            } else if (a == b && b == c) { // equilátero
                System.out.println("Os valores formam um triângulo equilátero.");
            } else if (a == b | a == c | b == c) { // isósceles
                System.out.println("Os valores formam um triângulo isósceles.");           
            } else {
                System.out.println("Ops... Algo deu errado!");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        input.close();
    }
}