package q3052;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i] % 42);
		}
		
/*		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			int element = iterator.next();
			//System.out.println(element + " ");
		}*/
		
		System.out.println(set.size());
	}
}
