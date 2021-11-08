import java.util.Scanner;

public class WrongSubtraction {

    // link the problem in Codeforces
    // https://codeforces.com/problemset/problem/977/A

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int operation = scanner.nextInt();

        for (int i=0; i<operation; i++){
            //antherAnswer();
            if (num%10 == 0){
                num /= 10;
                continue;
            }
            num--;
        }
        System.out.println(num);
    }

//    private static void antherAnswer() {
//        int length = num.toCharArray().length;
//        String lastNum = num.substring(length - 1);
//
//        if (lastNum.equals("0")){
//            num = Integer.parseInt(num) / 10 + "";
//        }else{
//            num = Integer.parseInt(num) - 1+"";
//        }
//    }
}
