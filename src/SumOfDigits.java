import java.util.Scanner;

public class SumOfDigits {

    // this is a link the problem in codeForces
    // https://codeforces.com/problemset/problem/102/B

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        if (num.length() == 1) {
            System.out.println(0);
            return;
        }
        char[] digits = num.toCharArray();
        int sum =0;

        for (int i = 0; i < num.length(); i++) {
            sum += digits[i] - '0';
        }
        int counter = 1;
        while (sum >= 10){
            sum = sum(sum);
            counter++;
        }
        System.out.println(counter);
    }
    public static int sum(int num){
        int result = 0;
        while (num != 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
