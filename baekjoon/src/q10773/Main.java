package q10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<K; i++) {
			int a = sc.nextInt();
			if(a == 0) {
				st.pop();
			} else {
				st.push(a);
			}
		}
		sc.close();
		int sum = 0;
		for(int num : st) {
			sum += num;
		}
		System.out.println(sum);
	}
}
