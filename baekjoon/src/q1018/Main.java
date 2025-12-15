package q1018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		char[][] arr = new char[N][M];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}
		sc.close();
		
		int answer = Integer.MAX_VALUE;
		
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				int wStart = 0;
				int bStart = 0;
				
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						char current = arr[i+x][j+y];
						if((x+y) % 2 == 0) {
							if(current != 'W') {
								wStart++;
							}
							if(current != 'B') {
								bStart++;
							}
						} else {
							if(current != 'W') {
								bStart++;
							}
							if(current != 'B') {
								wStart++;
							}
						}
					}
				}
				answer = Math.min(answer, Math.min(wStart, bStart));
			}
		}
		System.out.println(answer);
	}
}
