package q16916;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // 전체 문자열
        String p = sc.nextLine(); // 찾을 패턴
        sc.close();

        int j = 0;
        int[] pi = new int[p.length()];

        // 1. 부분 일치 테이블(pi 배열) 생성
        for (int i = 1; i < p.length(); i++) {
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }
            if (p.charAt(i) == p.charAt(j)) {
                pi[i] = ++j;
            }
        }

        // 2. 본문 문자열에서 KMP 탐색
        j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }
            if (s.charAt(i) == p.charAt(j)) {
                if (j == p.length() - 1) {
                    System.out.println(1);
                    return; // 찾으면 바로 종료
                }
                j++;
            }
        }

        System.out.println(0);
    }
}
