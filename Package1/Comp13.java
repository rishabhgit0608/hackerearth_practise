package Package1;

import java.util.*;

public class Comp13 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = sc.nextInt();
		int tarr[] = new int[t];
		for (int i = 0; i < t; i++) {
			tarr[i] = sc.nextInt();
		}
		int q = sc.nextInt();

		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < t; i++) {
			sum += tarr[i];
			if (sum >= num) {
				System.out.println(i + 1);
				break;
			}

		}
		if (sum < num) {
			System.out.println(-1);
		}

	}

}
