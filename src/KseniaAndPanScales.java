//import java.util.Scanner;
//
//public class PanScales {
//
//	public static void main(String[] args) {
//		Scanner scanner= new Scanner(System.in);
//		String scale = scanner.nextLine();
//		String value = scanner.nextLine();
//		String pointerright = "";
//		String pointerleft = "";
//		boolean flag = true;
//		 for (int i=0; i< scale.toCharArray().length; i++) {
//			 if (flag) {
//				 if(scale.toCharArray()[i] == '|') {
//					 flag = false;
//					 continue;
//				 }
//				 pointerleft += scale.toCharArray()[i];
//				 
//			 }else {
//				 pointerright += scale.toCharArray()[i];
//			 }
//		 }
//		 if ((pointerleft.toCharArray().length + pointerright.toCharArray().length + value.toCharArray().length) % 2 == 0
//				 && !(pointerleft.toCharArray().length >  pointerright.toCharArray().length + value.toCharArray().length)
//				 && !(pointerright.toCharArray().length >  pointerleft.toCharArray().length + value.toCharArray().length)){
//			 for (int x=0; x<value.length(); x++) { 
//				 if(pointerleft.length() > pointerright.length()) {
//					 pointerright += value.toCharArray()[x];
//				 }else{
//					 pointerleft += value.toCharArray()[x];
//				 }
//			 }
//			 System.out.println(pointerleft + "|" + pointerright);
//		 }else {
//			 System.out.println("Impossible");
//		 }
//		
//	}
//
//}
