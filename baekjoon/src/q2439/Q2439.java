package q2439;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      scan.close();
	      for (int i = 1; i <= n; i++) {
	         for (int k = 0; k < n; k++) {
	            if (k < n - i) System.out.print(" ");
	            else System.out.print("*");
	         }
	         System.out.println();
	      }
	   }
}
