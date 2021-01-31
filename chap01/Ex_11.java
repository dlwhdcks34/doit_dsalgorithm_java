package chap01_2;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력");
		int a = sc.nextInt();
		int c = 0;
		while(a>=1) {
			a/=10;
			c++;
		}
		System.out.println("그 수는 "+c+"자리입니다.");
	}

}
