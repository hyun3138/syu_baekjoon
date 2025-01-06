package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // 472
		int n2 = sc.nextInt(); // 385
		sc.close();
		int n2_first = n2 % 10; //5
		int n2_sec = n2 /10 % 10; //8 -> 38 % 10
		int n2_third = n2 /100; //3
		System.out.println(n1 * n2_first);
		System.out.println(n1 * n2_sec);
		System.out.println(n1 * n2_third);
		System.out.println(n1 * n2);
	}
}
