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

            number.sort(Integer::compareTo);
            System.out.println(number);
        } catch (InputMismatchException ex) {
            System.err.println("input non valido");
        } finally {
            input.close();
        }
        esercizio2(number);


    }

    public static void esercizio2(List<Integer> number) {
        for (int i = number.size(); i > 0; i--) {
            number.add(number.get(i - 1));
        }
        System.out.println(number);
    }


}
