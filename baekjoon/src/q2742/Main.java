package q2742;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i = num; i >= 1; i--) {
			System.out.println(num);
			num--;
		}
	}
}
