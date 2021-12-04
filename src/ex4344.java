import java.util.Scanner;

public class ex4344 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int C = s.nextInt();
		for (int i=0; i<C; i++) {
			
		int N = s.nextInt();
		int[] score = new int[N];
		float total = 0;
		float avg = 0;
		float cnt = 0;
		
		for (int j=0; j<N; j++) {
			score[j] = s.nextInt();
			total += score[j];
		}
		avg = total/N;
		
		for (int val : score) {
			if (val>avg) cnt++;
		}
		float ratio = cnt/N*100;
		System.out.printf("%.3f%%\n",ratio);
		}
		
		s.close();
	}
}