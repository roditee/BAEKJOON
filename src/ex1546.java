import java.util.Scanner;

public class ex1546 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt(); //���� ����
		float[] score = new float[N];
		float max = -1;
		
		for (int i=0; i<N; i++) {
			score[i] = s.nextFloat(); //���� ���� �Է�
			if (score[i] > max) max = score[i];
		}
		
		float total = 0;
		for (int i=0; i<score.length; i++) {
			score[i] = score[i] / max * 100;
			total+=score[i];
		}
		System.out.printf("%.1f",total/score.length);
		
		s.close();
	}

}
