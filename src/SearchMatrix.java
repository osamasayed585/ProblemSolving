import java.util.Scanner;

public class SearchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int colm = scanner.nextInt();
		int [][] arr = new  int [row][colm];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				arr[i][j] =scanner.nextInt();
			}
		}
		int flag = 0;
		int search=scanner.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				if (arr[i][j]==search) {
					flag++;
					break;
				}
		}
			if (flag == 1) {
				break;
			}
	}
		
		if (flag == 1) {
			System.out.println("will not take number");
		}
		else {
			System.out.println("will take number");
		}
	}
}

