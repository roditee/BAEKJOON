import java.util.Scanner;

public class ex2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] star = new String[n][(2*n)-1];
		
		//배열 초기화
		for (int i=0; i<n; i++) {
			for (int j=0; j<(2*n)-1; j++) {
				star[i][j] = "";
			}
		}
		
		for (int i=0; i<n-1; i++) {
			for (int j=n-2; j>=0; j--) {
				star[i][j] = " ";
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=n-1-i; j<=n-1+i; j++) {
				star[i][j] = "*";
			}
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(String.join("", star[i]));
		}
	}

}
