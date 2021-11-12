import java.util.Scanner;

public class ex11654 {

	public static void main(String[] args) {
		//인풋스트림으로 바이트 하나 읽어오기 가능
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		char c = s.charAt(0);
		int num = (int)c;
		System.out.println(num);
		
		//위 3줄을 한 줄로
		//System.out.println((int)s.charAt(0));
	}
}
