package chap03_2;

import java.util.Scanner;
//선형 검색
public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		int i=0;

		while(true) {
			if(i==n)
				return -1; //검색 실패(-1을 반환)
			if(a[i]==key)
				return i; //검색 성공(인덱스를 반환)
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];		//요소 수가 num인 배열

		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");    //키 값을 입력
		int key = sc.nextInt();
		int idx = seqSearch(x, num, key);		//배열 x에서 키 값이 key인 요소를 검색

		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"는 x["+idx+"]에 있습니다.");
		}
	}

}
