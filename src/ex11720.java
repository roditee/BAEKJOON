import java.util.Scanner;

public class ex11720 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String num = s.next();
		int total = 0;
		
		for (int i=0; i<N; i++) {
			total+=(int)num.charAt(i)-0x30;
		}
		System.out.println(total);
		
		s.close();
	}

}
