package chap01_2;

import java.util.Scanner;

public class Ex_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다");
		System.out.print("단수 : ");
		int a = sc.nextInt();
		for(int i =1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
