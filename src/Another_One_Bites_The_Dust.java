import java.util.Scanner;

public class Another_One_Bites_The_Dust {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextInt();
        long num2 = scanner.nextInt();
        long num3 = scanner.nextInt();

        long a = num1 + num3;
        long b = num2 + num3;
        if (a > b){
            System.out.println((b*2) +1);
        }else if (b > a) {
            System.out.println((a*2) + 1);
        }else {
            System.out.println(a * 2);
        }
    }
}
