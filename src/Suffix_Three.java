
import java.util.Scanner;

public class Suffix_Three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            String word = scanner.next();
            int length = word.toCharArray().length;
            if (length >= 4) {

                if (word.substring(length - 2).equals("po")) {
                    System.out.println("FILIPINO");
                } else if (word.substring(length - 4).equals("desu") || word.substring(length - 4).equals("masu")) {
                    System.out.println("JAPANESE");
                } else if (word.substring(length - 5).equals("mnida")) {
                    System.out.println("KOREAN");
                }

            } else {
                System.out.println("FILIPINO");
            }
        }

    }
}


