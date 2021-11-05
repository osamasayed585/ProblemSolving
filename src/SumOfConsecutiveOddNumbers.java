import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new  Scanner(System.in);
		int row = scanner.nextInt();
		int sum = 0;
		for (int j = 0; j < row; j++) {
			sum = 0;
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		for (int i = min+1; i < max; i++) {
			if (i % 2 != 0) {
				sum +=i;
				}
			}     
		System.out.println(sum);
       }
	}
}
