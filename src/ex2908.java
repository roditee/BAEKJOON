import java.util.Scanner;

public class ex2908 {
	static int reverse(int n) {
		int q = n;
		int r = 0;
		int m = 0;
		
		while(q!=0) {
			r = q%10;
			q = q/10;
			m = m*10 + r;
		}
		return m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = reverse(sc.nextInt());
		int b = reverse(sc.nextInt());
		
		if (a < b) System.out.println(b);
		else System.out.println(a);
		
		sc.close();
	}

}
