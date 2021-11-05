
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class horseshoe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbs = new HashSet<>();
        for (int i=0; i<4 ; i++){
            numbs.add(scanner.nextInt());
        }
        System.out.println(4 - numbs.size());
    }
}
