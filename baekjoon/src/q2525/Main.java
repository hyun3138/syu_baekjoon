package q2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int co = sc.nextInt();
		m += co;
		
		while(true) {
			if(m < 60) {
				break;
			} else {
				h+=1;
				m-=60;
			}
		}
		if(h >=24) {
			h-= 24;
		}
		System.out.printf("%d %d", h, m);
		sc.close();
	}
}
