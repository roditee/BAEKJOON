
public class ex2447 {

	public static void main(String[] args) {
		int n = 27;
		printStar(n);
	}
	
	static void printStar(int n) {
		for (int i=1; i<=n/3; i++) {
			System.out.print("***");
		}
		
		System.out.println();
		
		for (int i=1; i<=n/3; i++) {
			System.out.print("* *");
		}
		
		System.out.println();
		
		for (int i=1; i<=n/3; i++) {
			System.out.print("***");
		}
		System.out.println();
	}
}
