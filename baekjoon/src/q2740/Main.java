package q2740;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M1 = sc.nextInt();
		int[][] A = new int[N][M1];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++	 ) {
				A[i][j] = sc.nextInt();
			}
		}
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		int[][] B = new int[M2][K];
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[i].length; j++	 ) {
				B[i][j] = sc.nextInt();
			}
		}
		
		int[][] C = new int[N][K];
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				int temp = 0;
				for(int k=0; k<B.length; k++) {
					temp += A[i][k] * B[k][j];
				}
				C[i][j] = temp;
			}
		}
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
