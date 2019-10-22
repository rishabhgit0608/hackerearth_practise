package Package1;

import java.util.*;

public class Comp12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long test = sc.nextInt();
		while (test-- != 0) {
			long num = sc.nextInt();
			long A = sc.nextInt();
			long min = Integer.MAX_VALUE;

			long B = sc.nextInt();
			long arr[] = new long[(int) (num + 1)];
			for (long i = 0; i <= num; i++) {
				long X = (int) i;
				long Y = (int) (num - i);
				long cost = (int) (A * X * X + B * Y * Y);
				arr[(int) i] = cost;
				if(arr[(int) i]<min) {
					min = arr[(int) i];
				}
			}

			System.out.println(min);
		}

	}

}
