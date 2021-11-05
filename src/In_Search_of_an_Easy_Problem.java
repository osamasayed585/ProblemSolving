import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int counter=0;
        for (int i=0; i<size; i++){
            int num = scanner.nextInt();
            if (num > 0){
                counter++;
            }
        }
        if(counter>0) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
