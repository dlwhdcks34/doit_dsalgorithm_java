package chap01_1;

import java.util.Scanner;

public class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		System.out.println("d의 값 : ");
		int d = sc.nextInt();
	
		System.out.println("네 값 중 최솟값 : "+min4(a,b,c,d));
	}

}
