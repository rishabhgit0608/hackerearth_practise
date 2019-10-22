package Package1;

import java.util.Scanner;

public class CComp8 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test = sc.nextInt();
		while (test-- != 0) {
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			int N3 = sc.nextInt();
			int N4 = sc.nextInt();

			int min = min(N1, N2, N3, N4);
			System.out.println(min);
		}

	}

	private static int min(int n1, int n2, int n3, int n4) {
		// TODO Auto-generated method stub
		if (n1 <= n2 && n1 <= n4 && n1 >= n3) {
			return n1;
		} else if ((n2 <= n1 && n2 <= n4 && n2 <= n3)) {
			return n2;
		} else 
		{
			return n4;
		}
	}

}
