package q3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		int count = 0;
		boolean b1;
		for(int i=0; i<arr.length; i++) {
			b1 = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					b1 = true;
					break;
				}
			}
			if(b1 == false) {
				count++;
			}
		}
		System.out.println(count);
	}
}
