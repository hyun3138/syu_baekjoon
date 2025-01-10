package q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> qqq = new LinkedList<Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
			int a;

			switch (cmd) {
			case "push":
				a = sc.nextInt();
				qqq.offer(a);
				break;
			case "pop":
				if (qqq.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(qqq.poll());
				}
				break;
			case "size":
				System.out.println(qqq.size());
				break;
			case "empty":
				if (qqq.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (qqq.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(qqq.peek());
				}
				break;
			case "back":
				if (qqq.isEmpty()) {
					System.out.println(-1);
				} else {
					int last = 0;
					for (int value : qqq) {
						last = value;
					}
					System.out.println(last);
				}
				break;
			}
		}
		sc.close();
	}
}
