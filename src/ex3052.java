import java.util.Arrays;
import java.util.Scanner;

public class ex3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int[] div = new int[10];
//		
//		for (int i=0; i<10; i++) {
//			int n = s.nextInt();
//			div[i] = n%42;
//		}
//		//확인
//		System.out.println(Arrays.toString(div));
//		
//		int cnt = 0;
//		for (int i=0; i<div.length; i++) {
//			for (int j=i+1; j<div.length; j++) {
//				if (div[i]==div[j]) cnt++;
//			}
//		}
//		//확인
//		System.out.println(cnt);
//		System.out.println(div.length - cnt);
		
		boolean[] check = new boolean[42];
		int cnt = 0;
		for (int i=0; i<10; i++) {
			int n = s.nextInt();
			check[n%42] = true;
		}
		for (int i=0; i<check.length; i++) {
			if (check[i] == true) cnt++;
		}
		System.out.println(cnt);
	}
}
