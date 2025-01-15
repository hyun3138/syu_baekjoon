package q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int oldNum = 0, newNum = 0;

		do {
			cnt++;
			int n2 = 0, n1 = 0;
			oldNum = newNum;
			n2 = oldNum / 10; // 10자리
			n1 = oldNum % 10; // 1자리
			newNum = (n1 * 10) + (n2 + n1) % 10;
		} while (N != newNum);

		System.out.println(cnt);
	}
}
