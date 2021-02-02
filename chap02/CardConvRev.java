package chap02_1;

import java.util.Scanner;

//입력 받은 10진수를 2진수~36진수로 기수변환 하여 나타냄

public class CardConvRev {
// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환한다.
	static int cardConvR(int x, int r,char[] d) {
		int digits = 0; 		//변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		}while(x !=0);
		return digits;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();		//변환하는 정수
		int cd = sc.nextInt();		//기수
		int dno;					//변환 후의 자릿수
		int retry;					//재반복여부
		char[] cno = new char[32];	//변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		do {
		dno = cardConvR(no, cd, cno);
		System.out.println(cd+"진수로는 ");
		for(int i= (dno-1); i>=0;i--) {
			System.out.print(cno[i]);
		
		}
		System.out.println("다시 하시겠습니까?(1.예 / 0.아니오)");
		retry = sc.nextInt();
	}while(retry==1);
		
		
	}

}
