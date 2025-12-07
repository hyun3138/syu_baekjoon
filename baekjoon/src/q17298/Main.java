package q17298;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Stack<Integer> st = new Stack<>();
		sc.close();
		for(int i=0; i<N; i++) {
			// 스택이 비어 있으면 push -> 그렇지 않은 경우 반복문 형성
			// 스택의 맨 위 수로부터 판단되는 수열의 수가 현재 수보다 작다면(오큰수) 바꿔준다.
			while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
				arr[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			arr[st.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);
	}
}
