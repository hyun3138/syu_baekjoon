package q5086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			if(a1 == 0 && a2 == 0) {
				break;
			}
			if(a2 % a1 == 0) {
				System.out.println("factor");
			} else if(a1 % a2 == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
}
