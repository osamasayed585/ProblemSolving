import java.util.Scanner;

public class GoodNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int range = scanner.nextInt();
		int result = 0;
		int counter =0;
		for (int i=0; i<size; i++) {
			String num =scanner.next();
			for (int x=0; x<num.length(); x++) {
				counter =0;
				for(int z=0; z<=range; z++) {
					if(num.contains(String.valueOf(z))) {
						counter++;
					}
				}
			}
			if (counter == range +1) {
				result++;
			}
		}
		System.out.println(result);
	}

}
