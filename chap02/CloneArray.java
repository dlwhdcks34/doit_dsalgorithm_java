package chap02_1;

public class CloneArray {
//배열을 복제한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone(); //b는 a의 복제를 참조
		
		b[3]=0;
		
		System.out.print("a=");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
	
		}
		System.out.println("\nb=");
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
	}

}
