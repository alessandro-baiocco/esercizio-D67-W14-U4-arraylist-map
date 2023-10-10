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
        esercizio2b(number);


        esercizio2c(number, true);


    }

    public static void esercizio2b(List<Integer> number) {
        List<Integer> number2 = new ArrayList<>(number);
        for (int i = number2.size(); i > 0; i--) {
            number2.add(number.get(i - 1));
        }
        System.out.println(number2);
    }

    public static void esercizio2c(List<Integer> number, boolean bool) {
        Iterator<Integer> i = number.iterator();
        while (i.hasNext()) {
            int currentInt = i.next();
            if (bool) {
                if (currentInt % 2 != 0) i.remove();
            } else {
                if (currentInt % 2 == 0) i.remove();
            }
        }
        System.out.println(number);
    }


}

