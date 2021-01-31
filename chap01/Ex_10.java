package chap01_2;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 변수 입력");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		while(a>=b) {
			System.out.println("a보다 큰 값을 입력하세요");
			System.out.print("b의 값 : ");
			b = sc.nextInt();
		}
		System.out.println("b-a는 "+(b-a)+"입니다.");
		
	}

}
