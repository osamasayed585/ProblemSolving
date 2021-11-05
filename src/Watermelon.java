import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		if (num <= 2){
			System.out.println("No");
			return;
		}
		if (num % 2 == 0) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}