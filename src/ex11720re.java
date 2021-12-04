import java.util.Scanner;

public class ex11720re {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		
		char c = 0;
		int num = 0;
		int total = 0;
		String str = scan.next();
		for (int i=0; i<N; i++) {
			c = str.charAt(i);
			num = c - 0x30;
			total+=num;
		}
		System.out.println(total);
		
		scan.close();
	}
}