package chap03_3;

import java.util.Scanner;

public class Ex_03 {
static int searchIdx(int[] a, int n, int key, int[] idx) {
	int count=0;
	for(int i=0;i<n;i++) {
		if(a[i]==key) {
			idx[count++]=i;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("찾는 값 : ");
		int key = sc.nextInt();
		
		int count = searchIdx(x, num, key, y);
		
		if(count==0) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			for(int i=0; i<count;i++) {
				System.out.println("그 값은 x[" + y[i] + "]에 있습니다.");
			}
		}
		
	}

}
