import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1; //4  // 5     //8   //9  //12 //13 
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i< num; i++) { // 2 //   1   //2  //1  //2 //1 
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
