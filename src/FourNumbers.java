import java.util.Scanner;

public class FourNumbers {

	public static void main(String[] args) {
		// this my  code
		long sum = 1;
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			int no = scanner.nextInt();
			sum *=no;
			}
		System.out.println(sum);
	}
}