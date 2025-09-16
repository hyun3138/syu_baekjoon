package q8958;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String str = sc.next();
			int count = 1;
			int score = 1;
			int sum = 0;
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				if(c == 'O') {
					sum += score * count;
					count++;
				} else {
					count = 1;
					score = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
