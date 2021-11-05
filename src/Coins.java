
import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =0;
        int b =0;
        int c =0;
        char []num;
        for (int i=0; i<3; i++){
            String value = scanner.next();
            num = value.toCharArray();
            if (num[1] == '>'){
                if (num[0] == 'A'){
                    a++;
                }
                else if (num[0] == 'B'){
                    b++;
                }
                else if (num[0] == 'C'){
                    c++;
                }
            }
            else if (num[1] == '<'){
                if (num[2] == 'A'){
                    a++;
                }
                else if (num[2] == 'B'){
                    b++;
                }
                else if (num[2] == 'C'){
                    c++;
                }
            }
        }
        if (a == b || a == c || b == c) {
            System.out.println("Impossible");
        }
        else if (a > b && a > c) {  // . . A
            if (b > c) {
                System.out.println("CBA");
            } else {
                System.out.println("BCA");
            }
        } else if (b > a && b > c) {  // . . B
            if (a > c) {
                System.out.println("CAB");
            } else {
                System.out.println("ACB");
            }
        } else if (c > a && c > b) {  // . . C
            if (a > b) {
                System.out.println("BAC");
            } else {
                System.out.println("ABC");
            }
        }
    }
}
