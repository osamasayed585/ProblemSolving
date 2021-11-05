import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		    int num = scanner.nextInt();
			int value1 = scanner.nextInt();
	        int value2 = scanner.nextInt();
	        int sum = 0;
	        
	        for (int i = 1; i < num; i++) {
	        	if (i / 10 == 0) {
	        		if (i >= value1 && i <= value2) {
	        			sum +=i;
	        		}
	        	}
	        	
	        	else {
	        		int number = i;   
	        		int mysum = 0; 
	        		while (number != 0 ) {
	        			int mynum = number %10;   
	        			mysum += mynum;
		        		number /= 10;    
	        		}
	        		if (mysum >= value1 && mysum <= value2) {
	        			sum += i;
	        		}
         	
	        	}
	        }
	        System.out.println("Sume= "+sum);
	        }
}