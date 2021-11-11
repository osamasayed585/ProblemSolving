import java.util.Scanner;

public class LovelyPalindromes {

    // this is link the problem in codeforces
    // https://codeforces.com/contest/688/problem/B

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        char[] numbers = num.toCharArray();
        System.out.print(num);

        for (int i= numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]);
        }
    }
}
