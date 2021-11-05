import java.util.Scanner;

public class YaroslavAndPermutations {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int length = scanner.nextInt();
		int[] nums = new int[length];
		for (int i=0; i<length; i++ ) {
			nums[i] = scanner.nextInt();
		}
		int res =0;
		for (int i=0; i<nums.length; i++) {
			int pounter = 0;
			for (int x=0; x<nums.length; x++) {
				if (nums[i] == nums[x]) {
					pounter++;
				}
			}
			if (pounter > res) {
				res = pounter;
			}
		}
		if (length % 2 == 0) {
			if(res <= length / 2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			length++;
			int p= length/2;
			if (res <= (length / 2) + 1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}