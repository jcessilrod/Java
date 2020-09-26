public class Alfabeto {
    public static void main(String[] args) {
        char ch = 'a';

        for (int count = 0; count <= 25; count++) {
            if (count != 25) {
                System.out.print(ch++ + ", ");
            } else {
                System.out.print(ch++ + ".");
            }
        }

        System.out.println();
    }
}