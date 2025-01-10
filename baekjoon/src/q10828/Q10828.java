package q10828;

import java.util.Scanner;

public class Q10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		NumStk stk = new NumStk(N);
		for(int i=0; i<N; i++) {
			String cmd = sc.next();
			
			switch(cmd) {
			case "push":
				int num = sc.nextInt();
				stk.push(num);
				break;
			case "top":
				stk.top();
				break;
			case "size":
				stk.size();
				break;
			case "empty":
				stk.empty();
				break;
			case "pop":
				stk.pop();
				break;
			}
		}
		sc.close();
	}
}

class NumStk {
	private int[] n;
	private int top;
	
	public NumStk(int p) {
		n = new int[p];
		top = -1;
	}
	public void push(int p) {
		n[++top] = p;
	}
	public void top() {
		if(top == -1) {
			System.out.println(top);
		} else {
			System.out.println(n[top]);
		}
	}
	public void size() {
		System.out.println(top + 1);
	}
	public void empty() {
		if (top == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	public void pop() {
		if(top != -1) {
			System.out.println(n[top--]);
		} else {
			System.out.println(top);
		}
	}
}