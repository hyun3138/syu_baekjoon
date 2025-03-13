package q4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			if(str.equals(".")) {
				break;
			}
			if(isValid(str)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		}
		sc.close();
	}
	
	private static boolean isValid(String str) {
		Stack<Character> st = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c == '(' || c=='[') {
				st.push(c);
			} else if(c==')') {
				if(st.isEmpty() || st.pop() != '(') {
					return false;
				}
			} else if(c==']') {
				if(st.isEmpty() || st.pop() != '[') {
					return false;
				}
			}
		}
		return st.isEmpty();
	}
}
