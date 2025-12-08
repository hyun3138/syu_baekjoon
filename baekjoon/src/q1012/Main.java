package q1012;

import java.util.Scanner;

public class Main {
	static int visited[][], arr[][];
	static int N, M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			N = sc.nextInt();//가로
			M = sc.nextInt(); //세로
			int K = sc.nextInt(); // 배추 개수
			arr = new int[N][M];
			visited = new int[N][M];
			int count = 0;
			// 배추 배열 받기
			for(int j=0; j<K; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[a][b] = 1;
			}
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(arr[j][k] == 1 && visited[j][k] != 1) { // 배추이고 방문한적 없으면
						count++;
						dfs(j,k); // 인접하는 배추들을 visited에 넣기 위해 dfs
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
	static int[] dx = {-1,0,0,1};
	static int[] dy = {0,1,-1,0};
	public static void dfs(int x, int y) {
		int nowx, nowy;
		visited[x][y] = 1;
		for(int i=0; i<4; i++) {
			nowx = x + dx[i];
			nowy = y + dy[i];
			if(nowx>=0 && nowx<N && nowy>=0 && nowy<M) {
				if(arr[nowx][nowy]==1 && visited[nowx][nowy]!=1) {
					dfs(nowx, nowy);
				}
			}
	}
	}
}
