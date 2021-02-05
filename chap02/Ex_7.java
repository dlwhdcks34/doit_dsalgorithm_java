package chap02_1;

import java.util.Scanner;

public class Ex_7 {
	/*static int cardConvR(int x, int r, char[] d) {
		int digits = 0; //변환 후의 자릿수
		int c=0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++]=dchar.charAt(x % r); //r로 나눈 나머지를 저장
			if(c==0) {
				System.out.println(r+"|     "+x);
				System.out.println("  +-----");
			
			x /= r;
			c++;
			}else {
				System.out.println(r+"|     "+x+" ··· "+x%r);
				System.out.println("  +-----");
				x/=r;
				c++;
				
			}
		}while(x !=0);
		
		
		
		return digits;
	}*/
	static int cardConvEx(int x, int r, char[] d) {
		int n = ((Integer) x).toString().length(); // 변환 전의 자릿수
		int digits = 0; // 변환 뒤의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
			char temp = d[i]; // 를 역순으로 정렬
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int dno;				//반환 후 자릿수
		char[] cno = new char[32];
		System.out.println("10진수를 기수변환합니다.");
		System.out.print("변환하는 음이 아닌 정수 : ");
		int num = sc.nextInt();
		System.out.print("어떤 진수로 변환할까요?(2-36) : ");
		int cd = sc.nextInt();  //기수
		dno=cardConvEx(num,cd,cno); 
		System.out.print(cd+"진수로 " );
		for(int i=(dno-1);i>=0;i--) {
			System.out.print(cno[i]);
		}
		System.out.print("입니다.");
		
	}

}
