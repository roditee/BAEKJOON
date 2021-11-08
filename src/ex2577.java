import java.util.Arrays;
import java.util.Scanner;

public class ex2577 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("입력");
		int A = s.nextInt();
		System.out.print("입력");
		int B = s.nextInt();
		System.out.print("입력");
		int C = s.nextInt();
		int N = A * B * C;
		int[] cnt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int idx;
		
		while((float)N/10 >= 0.1) {
			idx = N%10;
			cnt[idx]++;
			N/=10;
		}
		for (int i=0; i<cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
