package q2579;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i=1; i<n+1; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[n+1];
		if(n==1) {
			dp[1] = arr[1];
		} else if(n==2) {
			dp[2] = arr[2] + arr[1];
		} else {
			dp[1] = arr[1];
			dp[2] = arr[2] + arr[1];
			dp[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);
			
			for(int i=4; i<n+1; i++) {
				dp[i] = Math.max(dp[i-3] + arr[i] + arr[i-1], dp[i-2] + arr[i]);
			}
		}
		System.out.println(dp[n]);
		sc.close();
	}
}
