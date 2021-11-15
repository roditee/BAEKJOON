import java.util.Scanner;

public class ex2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		char c = 0;
		String str = null;
		
		for (int i=0; i<T; i++) {
			String[] S = sc.next().split(" ");
			for (int j=0; j<S[1].length(); j++) {
				c = S[1].charAt(j);
				for (int k=0; k<Integer.parseInt(S[0]); k++) {
					System.out.print(c);
				}
			}
		}
	}

}

//int n = Integer.parseInt(sc.nextLine());
//
//for (int i=0; i<n; i++) {
//	String[] temp = sc.nextLine().split(" ");
//	int repeat = Integer.parseInt(temp[0]);
//	String str = temp[1];
//	
//	for (char ch : str.toCharArray() ) {
//		for (int j=0; j<repeat; j++) {
//			System.out.printf("%c", ch);
//		}
//	}
//	System.out.println();
//}