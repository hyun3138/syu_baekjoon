package q1715;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			int a= sc.nextInt();
			pq.add(a);
		}
		sc.close();
		int sum = 0;
		while(!pq.isEmpty()) {
			int cur = pq.poll();
			if(pq.isEmpty()) {
				System.out.println(sum);
				break;
			}
			int next = pq.poll();
			cur += next;
			sum += cur;
			pq.add(cur);
		}
	}
}
