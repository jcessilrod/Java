/*
    Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
    três e que se encontram no conjunto dos números de 1 até 500
*/
public class ExRepeticao01 {
    public static void main(final String[] args) {
        int i, soma = 0;

        for (i = 0; i < 500; i++) {
            if (i % 2 != 0) {
                if (i % 3 == 0) {
                    soma += i;
                }
            }
        }

        System.out.println("A soma de todos os números ímpares que são múltiplos de três(até 500) é " + soma);
    }    
}