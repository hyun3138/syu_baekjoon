package q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int numbox = 1;
		int cnt = 1;
		while(N > numbox) {
			numbox += cnt * 6;
			cnt++;
		}
		System.out.println(cnt);
	}
}
