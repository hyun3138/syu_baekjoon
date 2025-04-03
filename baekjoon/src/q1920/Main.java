package q1920;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(sc.nextInt());
		}
		int M = sc.nextInt();
		int[] brr = new int[M];
		for(int i=0; i<M; i++) {
			brr[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<M; i++) {
			if(set.contains(brr[i])) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
