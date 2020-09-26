/*
    Este programa tenta declarar uma variável
    em um escopo interno com o mesmo nome de uma
    definida em um escopo externo.
*/

public class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count++) {
            System.out.println("This is count: " + count);
            
            // inválido - não pode declarar count novamente porque ela já foi declarada
            
            // int count;

            for (count = 0; count < 2; count++) {
                System.out.println("This program is in error!");
            }
        }
    }
}