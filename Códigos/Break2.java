/*
    Lê a entrada até um q ser recebido.
*/
public class Break2 {
    public static void main(String[] args) 
        throws java.io.IOException {
            char ch;

            for ( ; ;) { // Este laço "infinito" é encerrado por break.
                ch = (char) System.in.read(); // obtém um char
                if (ch == 'q') break;
            }
            System.out.println("You pressed q!");
    }
}