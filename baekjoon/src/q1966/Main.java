package q1966;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int start = 0;
			Queue<int[]> q = new LinkedList<>();
			for(int j=0; j<N; j++) {
				q.add(new int[] {j,sc.nextInt()}); 
			}
			while(true) {
				int now[] = q.remove();
				boolean res = true;
				
				for(int que[] : q) {
					if(que[1] > now[1]) {
						res = false;
						break;
					}
				}
				
				if(res) {
					start++;
					if(now[0] == M) {
						break;
					} 
				} else {
					q.add(now);
				}
			}
			System.out.println(start);
			
		}
	}
}
