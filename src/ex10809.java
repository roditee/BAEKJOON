import java.util.Scanner;

public class ex10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
//		int[] idx = new int[26];
//		char c = 0;
//		
//		for (int i=0; i<str.length(); i++) {
//			for (int j=0; j<idx.length; j++) {
//				c = str.charAt(i);
//				idx[c-0x31] = str.indexOf(c);
//			}
//			System.out.println(idx[i]);
//		}
		
		

		for (int i=97; i<123; i++) {
			System.out.printf("%d ", str.indexOf(i));
		}
	}
}