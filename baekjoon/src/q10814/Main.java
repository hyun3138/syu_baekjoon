package q10814;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Member> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			list.add(new Member(age, name, i));
		}
		sc.close();
		list.sort(Comparator.comparingInt((Member m) -> m.age).thenComparingInt(m -> m.index));
		for(Member member : list) {
			System.out.println(member.age + " " + member.name);
		}
	}
}

class Member{
	int age;
	String name;
	int index;
	
	public Member(int age, String name, int index) {
		this.age = age;
		this.name = name;
		this.index = index;
	}
}