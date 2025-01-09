package q10039;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 40) {
				sum += 40;
			} else {
				sum += arr[i];
			}
		}
		System.out.println(sum / arr.length);
	}
}
