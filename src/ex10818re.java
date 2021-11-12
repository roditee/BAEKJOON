import java.util.Scanner;

public class ex10818re {

	public static void main(String[] args) {
		//배열 사용하지 않고 푸는 방법
		Scanner s = new Scanner(System.in);
		int max = -1000001;
		int min = 1000001;
		
		System.out.print("입력하세요 : ");
		int N = s.nextInt();
		
		for(int i=0; i<N; i++) {
			int n = s.nextInt();
			if (max < n) max = n;
			if (min > n) min = n;
		}
		System.out.println(min + " " + max);
	}

}
