import java.util.Scanner;

public class PoliceRecruits {

    // link the problem in codeforces
    // https://codeforces.com/problemset/problem/427/A

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter = 0;
        int numPrint = 0;
        for(int i=0; i<size; i++){
            int num = scanner.nextInt();
            if (num >= 1){
                counter += num;
            }else {
                if (counter != 0) counter--;
                else numPrint++;
            }
        }
        System.out.println(numPrint);
    }
}
