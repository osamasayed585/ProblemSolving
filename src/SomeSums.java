import java.util.Scanner;

public class SomeSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int value = scanner.nextInt();
		int value2 = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++){
			if ( i / 10 == 0) {  
				if (i >= value && i <= value2) {
					sum+=i;
				}
			}
			else { 
				int number = i;
				int val =0;
				while (number != 0) {
				int mynum = number % 10;  
			    number /= 10;  
			     val += mynum  ;
			     }
				 if (val >= value && val <= value2) {
				   sum+=i;
				}
			}
		}
		System.out.println(sum);

	}

}
