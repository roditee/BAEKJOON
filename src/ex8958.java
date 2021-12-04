import java.util.Scanner;

public class ex8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = new String[s.nextInt()];
		
		
		for (int i=0; i<arr.length; i++) {
			
			char c = 0;
			int cnt = 1;
			int total = 0;
			arr[i] = s.next();
			
			for (int j=0; j<arr[i].length(); j++) {
				c = arr[i].charAt(j);
				if (c == 'O') total += cnt++;
				else cnt = 1;
			}
			System.out.println(total);
		}
		
		s.close();
	}
}
