package q1157;

import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String str = sc.next();
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+'a');
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
