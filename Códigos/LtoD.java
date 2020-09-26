/*
    Demonstra a conversão automática de long para double.
*/
public class LtoD {
    public static void main(String[] args) {
        long longVar;
        double doubleVar;

        longVar = 100123285L;
        doubleVar = longVar; // conversão automática de long para double

        System.out.println("longVar and doubleVar: " + 
                longVar + " " + doubleVar);
    }
}