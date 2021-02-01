package chap01_2;

import java.util.Scanner;

public class Ex_16 {

	static void spira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("피라미드를 출력합니다.");
		
		do {
			System.out.print("몇 단 피라미드 입니까?");
			n = sc.nextInt();
		}while(n<=0);
		
		spira(n);
	
	}
}
