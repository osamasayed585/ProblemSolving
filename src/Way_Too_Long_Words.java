import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i=0; i<size; i++){
            String word = scanner.next();
            if (word.toCharArray().length > 10){
                System.out.println(word.toCharArray()[0] +""+ (word.toCharArray().length-2) + word.toCharArray()[word.toCharArray().length-1]);
                continue;
            }
            System.out.println(word);
        }
    }
}
