import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userStrings = {""};

        Set<String> userStrings2 = new HashSet<>();
        List<String> duplicate = new ArrayList<>();
        try {
            System.out.println("inserisci un numero");
            int userInput = input.nextByte();
            for (int i = 0; i < userInput; i++) {
                System.out.println("inserisci una scritta");
                String newString = input.next();
                if (!userStrings2.toString().contains(newString)) {
                    userStrings2.add(newString);
                } else {
                    System.out.println("duplicato : " + newString);
                    duplicate.add(newString);
                }
            }
        } catch (InputMismatchException ex) {
            System.err.println("input non valido");
        } finally {
            System.out.println("stringe non duplicate : " + userStrings2);
            System.out.println("stringe duplicate : " + duplicate);
            input.close();
        }


    }
}