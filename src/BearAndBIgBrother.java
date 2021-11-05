import java.util.Scanner;

public class BearAndBIgBrother {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int res = 0;
		do {
			num1 *=3;
			num2 *=2;
			res++;
		}while(num1 <= num2);
		System.out.println(res);
	}
}
