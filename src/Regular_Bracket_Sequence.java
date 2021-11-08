import java.util.Scanner;

public class Regular_Bracket_Sequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] regular = scanner.next().toCharArray();
        int size = regular.length;
        int counter = 0;

        for (int i=0; i<regular.length; i++){

            if (regular[i] == '('){
                counter++;
            }else {
                counter--;
                if (counter < 0 ){
                    size--;
                    counter = 0;
                }
            }
        }
        System.out.println(size - counter);
    }
}
