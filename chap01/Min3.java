package chap01_1;

import java.util.Scanner;

public class Min3 {
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		
		
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
	
		System.out.println("세 값 중 최솟값 : "+min3(a,b,c));

	}

}
