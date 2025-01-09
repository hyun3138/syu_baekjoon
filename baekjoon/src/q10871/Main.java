package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열의 수
		int X = sc.nextInt(); // 기준 수

		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
