package chap02_1;

import java.util.Scanner;

public class Ex_2 {
	static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	static void reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			System.out.println("arr["+i+"]와 arr["+(arr.length-i-1)+"]을 교환합니다.");
			swap(arr, i,arr.length-i-1);
			for(int j = 0; j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		reverse(arr);
		System.out.println("역순 정렬을 마쳤습니다.");
		
	}

}
