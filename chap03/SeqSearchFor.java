package chap03_2;

import java.util.Scanner;
//선형검색 for문
public class SeqSearchFor {
	//배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색

	static int seqSearch(int[] a, int n, int key) {
		for(int i =0; i<n;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
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
