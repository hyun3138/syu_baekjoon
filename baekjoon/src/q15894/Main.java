package q15894;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long a = 0;
		long n = sc.nextLong();
		sc.close();
		if (n == 1) {
			a = 4;
		} else {
			a = 1 + (n * 3) + (n-1);
		}
		System.out.println(a);
	}
}
