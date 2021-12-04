import java.util.Scanner;

public class ex2562 {

	public static void main(String[] args) {
		//배열 사용
		Scanner s = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int maxIdx = 0;
		
		for (int i=0; i<9; i++) {
			arr[i] = s.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				maxIdx = i+1;
			}
		}
		System.out.println(max);
		System.out.println(maxIdx);
		
		//배열 사용 X
//		Scanner s = new Scanner(System.in);
//		int max = 0;
//		int maxIdx = 0;
//		
//		for (int i=0; i<9; i++) {
//			int n = s.nextInt();
//			if (max < n) {
//				max = n;
//				maxIdx = i+1;
//			}
//		}
//		System.out.println(max);
//		System.out.println(maxIdx);
		
		s.close();
	}
}
