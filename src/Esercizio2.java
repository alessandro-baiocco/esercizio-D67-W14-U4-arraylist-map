import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        Random rnd = new Random();

        try {
            System.out.println("inserisci un numero");
            int userInput = input.nextByte();
            for (int i = 0; i < userInput; i++) {
                number.add(rnd.nextInt(1, 100));
            }
            System.out.println(number);
        } catch (InputMismatchException ex) {
            System.err.println("input non valido");
        } finally {
            input.close();
        }


    }
}
