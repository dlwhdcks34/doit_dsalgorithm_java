package chap01_2;

import java.util.Scanner;
//1, 2, ..., n 의 핪(양수만)
public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 핪을 구합니다.");
		do {
			System.out.println("n의 값 : ");
			n = sc.nextInt();
		}while(n<=0);
			
		int sum=0;
		
		for(int i=0; i<=n;i++) {
			sum += i;
		}
		System.out.println("1부터 "+n+"까지의 합 : "+sum);

	}

}
