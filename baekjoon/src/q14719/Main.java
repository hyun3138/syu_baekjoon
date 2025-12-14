package q14719;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // 높이
		int W = sc.nextInt(); // 가로
		
		int[] arr = new int[W];
		for(int i=0; i<W; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int[] leftMax = new int[W];
		int[] rightMax = new int[W];
		
		leftMax[0] = arr[0];
		for(int i=1; i<W; i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i]);
		}
		
		rightMax[W-1] = arr[W-1];
		for(int i=W-2; i>=0; i--) {
			rightMax[i] = Math.max(rightMax[i+1], arr[i]);
		}
		
		int res = 0;
		for(int i=0; i<W; i++) {
			int water = Math.min(leftMax[i], rightMax[i]) - arr[i];
			if(water > 0) {
				res += water;
			}
		}
		System.out.println(res);
	}
}
