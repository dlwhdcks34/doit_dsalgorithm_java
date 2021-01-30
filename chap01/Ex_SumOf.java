package chap01_2;

import java.util.Scanner;

public class Ex_SumOf {
	static int sumof(int a, int b) {
		int sum=0;
		if(a>b) {
			for(int i=b;b<=a;b++) {
				sum +=b;
			}
			return sum;
		}else {
			for(int i=a;a<=b;a++) {
				sum +=a;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+"와"+b+"를 포함한 사이의 모든 정수 합 : "+sumof(a,b));
	}

}
