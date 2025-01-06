package q3040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] =Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int current = arr[i] + arr[j];
				if (sum - current == 100) {
					arr[i] = 0;
					arr[j] = 0;
					for(int k=0; k<arr.length; k++) {
						if(k!=i && k!=j) {
							System.out.println(arr[k]);
						}
					}
				}
			}
		}
	}
}
