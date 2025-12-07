package q2217;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] arr = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		// 내림차순 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		int max = 0;
		for(int i=0; i<N; i++) {
			int canLift = arr[i] * (i+1); // i 번째까지 로프 사용
			if(canLift > max) {
				max = canLift;
			}
		}
		System.out.println(max);
	}
}
