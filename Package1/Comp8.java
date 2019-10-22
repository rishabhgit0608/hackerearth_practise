package Package1;

import java.util.Scanner;

public class Comp8 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =sc.nextInt();
		int narr[]= new int[n];
		for (int i = 0 ;i<narr.length;i++) {
			narr[i] = sc.nextInt();
		}
		int k  = sc.nextInt();
		for(int i = 0;i<narr.length;i++) {
			if(k==narr[i]) {
				System.out.println(i);
				return;
			}
		}
		
	}

}
