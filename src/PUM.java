import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {

		int counter = 1;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i< num; i++) {
			if ( counter % 4 == 0) {
				System.out.println(" PUM");
				counter++;
			}
			else {
				System.out.print(counter++ +" "+counter++ +" "+counter++ );
				i--;
			}
		}
			
	}

}
