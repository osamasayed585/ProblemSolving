import java.util.Scanner;

public class NightAtTheMuseum {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String input = scanner.next();  
		int letters = 97;
		int move = 0;
		for (int i  = 0; i < input.length(); i++) {
			int res = Math.abs(input.toCharArray()[i] - letters);
			if (res <= 13) {
				move +=res;
				}
			else {
				move += (26 - res);
			}
			letters = input.toCharArray()[i];
		}
		System.out.println(move);
		}
}

