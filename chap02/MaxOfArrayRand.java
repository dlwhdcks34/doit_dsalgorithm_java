package chap02_1;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값을 나타낸다(값을 난수로 설정)
public class MaxOfArrayRand {
	//배열 a의 최댓값을 구하여 반환한다.
	static int maxOf(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구한다.");
		System.out.print("사람 수 : ");
		int num= sc.nextInt();
		
		int[] height = new int[num]; // 요솟수가 num인 배열을 생성
		
		System.out.println("키 값은 아래와 같다.");
		for(int i=0;i<height.length;i++) {
			height[i]=100+rand.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}

}
