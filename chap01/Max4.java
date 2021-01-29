package chap01_1;

import java.util.Scanner;

public class Max4 {
	//네 값의 최댓값을 구하는 메소드
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		System.out.println("d의 값 : ");
		int d = sc.nextInt();
		System.out.println("네 값 중 최댓값 : "+max4(a,b,c,d));

	}

}
