package chap01_1;

import java.util.Scanner;
//3개의 정숫값을 입력 후 최댓값 구하기
public class Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		
		int max = a;
		if(b > max) max=b;
		if(c > max) max=c;
		
		System.out.println("세 정수 중 최댓값은 "+max+"입니다.");
	}

}
