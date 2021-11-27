import java.util.Random;
import java.util.Scanner;

public class ex15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] a = new int[sc.nextInt()];
		
		for (int i=0; i<a.length; i++) {
			a[i] = rand.nextInt(1000000)+1;
		}
		System.out.println(sum(a));
	}
	
	static long sum(int[] a) {
		long ans = 0;
		for (int i=0; i<a.length; i++) ans+=a[i];
		return ans;
	}
}