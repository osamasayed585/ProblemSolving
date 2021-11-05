import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int counter = 0;
		for (int i=0; i<value; i++) { 
			int total = 0;
			for (int x=0; x<3; x++) {
				int input = scanner.nextInt();
				total += input;
			}
			if (total >= 2) {
				counter++;
			}
		}
		System.out.println(counter);
		}
}
