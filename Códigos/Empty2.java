/*
    Partes de for podem estar vazias.
*/
public class Empty2 {
    public static void main(String[] args) {
        int i;

        // a expressão de inicialização é removida do laço.
        i = 0; // move a inicialização para fora do laço
        for (; i < 10;) { // a expressão de iteração está faltando.
            System.out.println("Pass #" + i);
            i++; // incrementa a variável de controle de laço
        }
    }
}