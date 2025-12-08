package q1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int start = 1;
		boolean res = true; // 수열 생성 가능 여부
		for(int i=0; i<n; i++) {
			int num = sc.nextInt(); // 이번에 만들어야 할 숫자
			while(start <= num) {
				st.push(start++);
				sb.append("+\n");
			}
			if(!st.isEmpty() && st.peek() == num) {
				st.pop();
				sb.append("-\n");
			} else {
				res = false;
				break;
			}
		}
		sc.close();
		
		if(!res) {
			System.out.println("NO");
		} else {
			System.out.print(sb.toString());
		}
	}
}
