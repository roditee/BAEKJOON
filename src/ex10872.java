import java.util.Scanner;

public class ex10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
	}
	
	static int fact(int n) {
		if (n==0 || n==1) return 1;
		else return n * fact(n-1);
	}
}