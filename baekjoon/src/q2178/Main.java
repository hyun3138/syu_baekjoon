package q2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int[][] map = new int[N][M];
		for(int i=0; i<N; i++) {
			String line = sc.nextLine();
			for(int j=0; j<M; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		sc.close();
		//bfs
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,1,-1};
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0,0});
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0], y = cur[1];
			
			for(int dir=0; dir<4; dir++) {
				int nx = x + dx[dir];
				int ny = y + dy[dir];
				
				//범위 밖
				if(nx<0 || ny<0 || nx>=N || ny>=M) {
					continue;
				}
				//갈 수 없는 길
				if(map[nx][ny] == 0) {
					continue;
				}
				// 처음 방문하는 길이면 거리 누적
				if(map[nx][ny] == 1) {
					map[nx][ny] = map[x][y] + 1;
					q.add(new int[] {nx, ny});
				}
			}
		}
		System.out.println(map[N-1][M-1]);
	}
}
