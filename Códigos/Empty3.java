/*
    O corpo de um laço pode estar vazio.
*/
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // soma os números até 5
        for (i = 1; i <= 5; sum += i++); // não há corpo neste laço!

        System.out.println("Sum is " + sum);
    }
}