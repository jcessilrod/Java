public class ExRepeticaoWhile01 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 10) {
            while (j <= 10) {
                if (j == 1){System.out.printf("Tabuada do %d\n", i);}
                System.out.printf("%d x %d: %d\n", i, j, (i * j));
                j++;
            }

            System.out.println("");
            j = 1; i++;
        }
    }
}