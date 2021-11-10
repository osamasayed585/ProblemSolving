import java.util.Scanner;

public class Decoding {


    // this  is a link problem in CodeForces website
    // https://codeforces.com/problemset/problem/746/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String word = scanner.next();
        String newText = "";
        int n = size;

        for (int i=0; i<size; i++){

            if(n % 2 == 0){
                newText = word.toCharArray()[i] + newText;
            }else {
                newText = newText + word.toCharArray()[i];
            }
            n--;
        }
        System.out.println(newText);
    }
}
