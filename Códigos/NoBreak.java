/*
    Demonstra switch sem instruções break.
*/
public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.printf("i(%d) is less than one \n", i);
                case 1:
                    System.out.printf("i(%d) is less than two \n", i);
                case 2:
                    System.out.printf("i(%d) is less than three \n", i);
                case 3:
                    System.out.printf("i(%d) is less than four \n", i);
                case 4:
                    System.out.printf("i(%d) is less than five \n", i);
            }

            System.out.println();

        }
    }
}