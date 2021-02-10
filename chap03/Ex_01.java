package chap03_3;

import java.util.Scanner;

//선형 검색 (보초법)
public class Ex_01 {

	//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n]=key;	//보초를 추가
		
		for(i=0; i<=n;i++) {
			if(a[i]==key) {
				break;
			}
		}

		return i==n? -1 : i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];		//요소수 num +1
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int idx= seqSearchSen(x, num, key);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"는 x["+idx+"]에 있습니다.");
	}

}
