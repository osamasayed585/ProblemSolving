import java.util.Scanner;

public class LefthandersAndRighthandersAndAmbudexters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int secound = scanner.nextInt();
		int last = scanner.nextInt();
		int res = 0;
		 if (first < secound) {
			res= secound - first;
			if(res <= last){
				first += res;
				last -= res;
				first += last/2;
				secound += last/2;
			}else {
				first += last;
			}
		}
		 else if (first > secound) {
			res = first - secound;
			if(res <= last) {
				secound += res;
				last -= res;
				first += last/2;
				secound += last/2;
			}else {
				secound += last;
			}
		}
		else if (first == secound) {
		first+=last / 2;
		secound+=last / 2;
		}
		
		if (first < secound) {
			System.out.println(first * 2);
		}else if (first > secound) {
			System.out.println(secound * 2);
		}else if (first == secound){
			System.out.println(first + secound);
		}
	}
}