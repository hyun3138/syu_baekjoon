package q28278;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); // 명령 수
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);

            switch (command) {
                case 1: // 명령 1: 값 추가
                    st.push(Integer.parseInt(input[1]));
                    break;
                case 2: // 명령 2: 값 제거 및 출력
                    if (st.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(st.peek() + "\n");
                        st.pop();
                    }
                    break;
                case 3: // 명령 3: 스택 크기 출력
                    bw.write(st.size() + "\n");
                    break;
                case 4: // 명령 4: 스택 비었는지 확인
                    if (st.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case 5: // 명령 5: 가장 위의 값 출력
                    if (st.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(st.peek() + "\n");
                    }
                    break;
            }
        }
        
        bw.flush();  // 최종 출력 버퍼에 있는 내용을 모두 출력
        br.close();
        bw.close();
    }
}
