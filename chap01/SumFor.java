package chap01_2;

import java.util.Scanner;

public class SumFor {
//1,2 ..., n의 합을 구한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구한다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum=0;
		
		for(int i =1; i<=n;i++) {
			sum += i;
		}
		System.out.println("1부터 "+n+"까지의 합 : "+sum);
	}

}
