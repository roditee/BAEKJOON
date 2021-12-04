import java.util.Scanner;

public class ex11720re2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		int N = s.nextInt();
		String str = s.next();
		
		for (int i=0; i<str.length(); i++) {
			total+=Character.getNumericValue(str.charAt(i));
		}
		System.out.println(total);
		
		s.close();
	}
}
