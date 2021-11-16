import java.util.Scanner;

public class ex2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] star = new String[n][n];
		
		//배열 초기화
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				star[i][j] = " ";
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=n-1; j>=i; j--) {
				star[i][j] = "*";
			}
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(String.join("", star[i]));
		}
	}

}
