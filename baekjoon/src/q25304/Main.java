package q25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 가격
		int N = sc.nextInt(); // 물건 종류 수 
		int sum = 0;
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a*b;
		}
		if(sum == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
