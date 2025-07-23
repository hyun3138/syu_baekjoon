package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int count = 0;
			String str = sc.next();
			boolean b = true;
			for(int ii=0; ii<str.length(); ii++) {
				char c = str.charAt(ii);
				
				if(c == '(') {
					count++;
				}
				else {
					count--;
				}
				
				if(count < 0) {
					b = false;
					break;
				}
			}
			if(b && count==0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
}