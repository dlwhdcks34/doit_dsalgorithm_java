package chap01_1;

import java.util.Scanner;
// 입력한 정숫값이 양수인지 음수인지 0인지 판단
public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
	}

}
