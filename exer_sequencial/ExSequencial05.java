/*
    Faça um algoritmo que receba a quantidade de dinheiro em reais que uma pessoa vai viajar possui. 
    Ela vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão e 
    libra esterlina. Sabe-se que a cotação do dólar é de R$ 1,80, do marco alemão é de R$ 2,00 e 
    da libra esterlina é de R$ 1,57. O algoritmo deve fazer as conversões e mostrá-las.
*/
import java.util.Scanner;

public class ExSequencial05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double val_reais, val_dolares, val_marco_alemao, vai_libra_esterlina;

        System.out.print("Digite a quantidade de dinheiro em reais: ");
        val_reais = input.nextDouble();

        val_dolares = val_reais / 1.8;
        val_marco_alemao = val_reais / 2.0;
        vai_libra_esterlina = val_reais / 1.57;

        System.out.printf("Reais: %.1f\nDólares: %.1f\nMarco Alemão: %.1f\nLibra Esterlina: %.1f\n",
                            val_reais, val_dolares, val_marco_alemao, vai_libra_esterlina);

        input.close();
    }
}