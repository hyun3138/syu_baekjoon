package q2588;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		
		// case 2.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int num2_3 = num2 % 10;
		int num2_2 = (num2 %100) / 10;
		int num2_1 = num2 / 100;
		
		System.out.println(num2_3 * num1);
		System.out.println(num2_2 * num1);
		System.out.println(num2_1 * num1);
		System.out.println(num1 * num2);
		
		//case1.
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		int num2_1 = str2.charAt(0) - '0';
//		int num2_2 = str2.charAt(1) - '0';
//		int num2_3 = str2.charAt(2) - '0';
//		
//		System.out.println(num1 * num2_3);
//		System.out.println(num1 * num2_2);
//		System.out.println(num1 * num2_1);
//		System.out.println(num1 * num2);
		
		
	}
}
