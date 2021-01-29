package chap01_1;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값 구하기
public class Median {
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c; 
 		}else {
 			return b;
 		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		
		System.out.println("세 수의 중앙값 : "+med3(a,b,c));
	}

}
