package q9498;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
/*		
		// case 1.
		if(score >= 90) {
			System.out.print("A");
		} else if (score>=80 && score <=89 ) {
			System.out.print("B");
		} else if (score>=70 && score <=79 ) {
			System.out.print("C");
		} else if (score>=60 && score <=69 ) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
		*/
		// case 2.
		switch(score / 10) {
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
			default:
				System.out.print("F");
		}
	}
}
