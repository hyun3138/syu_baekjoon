package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Stk {
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int a = sc.nextInt();
				stk.push(a);
				break;
			case "pop":
				if(!stk.isEmpty()) {
					System.out.println(stk.pop());
				} else {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				if(stk.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				if(!stk.isEmpty()) {
					System.out.println(stk.peek());
				} else {
					System.out.println(-1);
				}
				break;
			}
		}
		sc.close();
	}
}
