import java.util.Scanner;

public class ColorfulStones {
public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String input1= scanner.next();
		String input2= scanner.next();
		int counter = 1;
		int x = 0;
		for (int i = 0; i < input2.length(); i++) {
			if (input1.toCharArray()[x] == input2.toCharArray()[i]) {
				counter++;
				x++;
			}
		}
		System.out.println(counter);
		}
}