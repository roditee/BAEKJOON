import java.util.Scanner;

public class ex11654 {

	public static void main(String[] args) {
		//��ǲ��Ʈ������ ����Ʈ �ϳ� �о���� ����
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		char c = s.charAt(0);
		int num = (int)c;
		System.out.println(num);
		
		//�� 3���� �� �ٷ�
		//System.out.println((int)s.charAt(0));
		
		scan.close();
	}
}
