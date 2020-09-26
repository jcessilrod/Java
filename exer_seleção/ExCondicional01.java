/*
    Escrever um algoritmo que leia 4 valores i, a, b, c, onde i é um valor inteiro e positivo 
    e a, b, c, são quaisquer valores reais. A seguir:  
        a) Se i=1 escrever os três valores a, b, c em ordem crescente
        b) Se i=2 escrever os três valores a, b, c em ordem decrescente 
        c)   Se i=3 escrever os três valores a, b, c de forma que o maior entre a, b, c fique dentre os dois
*/
import java.util.Scanner;

public class ExCondicional01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        int i;

        System.out.print("Digite o valor de 'i': ");
        i = input.nextInt();
        
        System.out.print("Digite o valor de 'a': ");
        a = input.nextInt();

        System.out.print("Digite o valor de 'b': ");
        b = input.nextInt();
        
        System.out.print("Digite o valor de 'c': ");
        c = input.nextInt();

        System.out.println("");
        
        if (i == 1) {
            if (a < b & a < c) {
                if (b < c) {
                    System.out.printf("Crescente: %.1f - %.1f - %.1f\n", a, b, c);
                } else if (c < b) {
                    System.out.printf("Crescente: %.1f - %.1f - %.1f\n", a, c, b);
                }
            } else if (b < c & b < a) {
                if (c < a) {
                    System.out.printf("Crescente: %.1f - %.1f - %.1f\n", b, c, a);
                } else if (a < c) {
                    System.out.printf("Crescente: %.1f - %.1f - %.1f\n", b, a, c);
                }
            } else if (c < a & c < b) {
                if (a < b) {
                    System.out.printf("Crescente: %.1f - %.1f - %.1f\n", c, a, b);
                } else if (b < a) {
                    System.out.printf("Crescente: %.1f - %.1f - %.1f\n", c, b, a);
                }
            }
        } else if (i == 2) {
            if (a > b & a > c) {
                if (b > c) {
                    System.out.printf("Decrescente: %.1f - %.1f - %.1f\n", a, b, c);
                } else if (c > b) {
                    System.out.printf("Decrescente: %.1f - %.1f - %.1f\n", a, c, b);
                }
            } else if (b > c & b > a) {
                if (c > a) {
                    System.out.printf("Decrescente: %.1f - %.1f - %.1f\n", b, c, a);
                } else if (a > c) {
                    System.out.printf("Decrescente: %.1f - %.1f - %.1f\n", b, a, c);
                }
            } else if (c > a & c > b) {
                if (a > b) {
                    System.out.printf("Decrescente: %.1f - %.1f - %.1f\n", c, a, b);
                } else if (b > a) {
                    System.out.printf("Decrescente: %.1f - %.1f - %.1f\n", c, b, a);
                }
            }
        } else if (i == 3) {
            if (a > b & a > c) {
                System.out.printf("%.1f - %.1f - %.1f\n", c, a, b);
            } else if (b > c & b > a) {
                System.out.printf("%.1f - %.1f - %.1f\n", a, b, c);
            } else if (c > a & c > b) {
                System.out.printf("%.1f - %.1f - %.1f\n", b, c, a);
            }
        } else {
            System.out.println("Ops... Algo deu errado!");
        }
        
        input.close();
    }
}