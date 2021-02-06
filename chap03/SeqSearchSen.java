package chap03_1.chap03_1;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;

		a[n] = key;

		while(true) {
			if(a[i]==key) {
				break;
			}
			i++;
		}
		return i == n ? -1:i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("��Ҽ� : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];

		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		System.out.println("�˻��� �� : ");
		int key = sc.nextInt();

		int idx = seqSearchSen(x, num, key);

		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");

		else {
			System.out.println(key+"�� x["+idx+"]�� �ֽ��ϴ�.");
		}
	}
}