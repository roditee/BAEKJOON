import java.util.Scanner;

public class ex10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(fib(sc.nextInt()));
	}
	static int fib(int n) {
		if (n==0) return 0;
		else if (n==1) return 1;
		else return fib(n-1) + fib(n-2);
	}
}
