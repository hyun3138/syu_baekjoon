package q3009;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1= sc.nextInt();
		int a2= sc.nextInt();
		
		int b1 = sc.nextInt();
		int b2= sc.nextInt();
		
		int c1= sc.nextInt();
		int c2 = sc.nextInt();
		
		int d1 = 0; 
		int d2 = 0;
		
		if(a1 == b1) {
			d1 = c1;
		} else if(a1 == c1) {
			d1 = b1;
		} else if (b1 == c1) {
			d1 = a1;
		}
		
		if(a2 == b2) {
			d2 = c2;
		} else if(b2 == c2) {
			d2 = a2;
		} else if(c2 == a2) {
			d2 = b2;
		}
		System.out.printf("%d %d", d1, d2);
		
		sc.close();
	}
}
