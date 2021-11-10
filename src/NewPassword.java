import java.util.Scanner;

public class NewPassword {

    // this  is a link problem in CodeForces website
    // https://codeforces.com/problemset/problem/770/A

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int letters = scanner.nextInt();
        String password = "";

        for (int i=97; i<97 + letters ; i++){
            password = password + (char)i;
        }
        for (int i=0; i<length; i++){
            if(password.toCharArray().length != length){
                password = password + password.toCharArray()[i];
            }
        }
        System.out.println(password);
    }

}
