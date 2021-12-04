import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex10818 {

	public static void main(String[] args) throws IOException{
//		//배열 + Scanner
//		int max = -1000001;
//		int min = 1000001;
//		Scanner s = new Scanner(System.in);
//		//System.out.print("정수를 입력하세요 : ");
//		//백준에서는 지워야 정답처리됨
//		int N = s.nextInt();
//		int[] arr = new int[N];
//		
//		//System.out.printf("%d개의 값을 입력하세요 : ", N);
//		//백준에서는 지워야 정답처리됨
//		for (int i=0; i<arr.length; i++) {
//			int val = s.nextInt();
//			arr[i] = val;
//			
//			if (min > arr[i]) min = arr[i];
//			if (max < arr[i]) max = arr[i];
//		}
//		System.out.println(min + " " + max);
		
		
		//배열 + BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("정수를 입력하세요 : ");
		//백준에서는 지워야 정답처리됨
		int N = Integer.parseInt(br.readLine());
		//System.out.print("값을 입력하세요 : ");
		//백준에서는 지워야 정답처리됨
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			for (int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if (min > arr[i]) min = arr[i];
				if (max < arr[i]) max = arr[i];
			}
		}
		System.out.println(min + " " + max);
		
		
//		//배열 사용하지 않고 푸는 방법
//		Scanner s = new Scanner(System.in);
//		int max = -1000001;
//		int min = 1000001;
//		
//		System.out.print("입력하세요 : ");
//		int N = s.nextInt();
//		
//		for(int i=0; i<N; i++) {
//			int n = s.nextInt();
//			if (max < n) max = n;
//			if (min > n) min = n;
//		}
//		System.out.println(min + " " + max);
	}
}