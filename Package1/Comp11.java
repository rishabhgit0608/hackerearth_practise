package Package1;

import java.util.*;

public class Comp11 {
	static Scanner sc = new Scanner(System.in);

	static void subArray(int length, char arr[]) {
		// Pick starting point
		int count = 0;
		for (int i = 0; i < length; i++) {
			// Pick ending point
			for (int j = i; j < length; j++) {
				int product = 1;
				for (int k = i; k <= j; k++) {
					product *= arr[k];
				}
				if (product >= 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String str = sc.next();
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] =  str.charAt(i);
		}

		subArray(arr.length, arr);
	}
}
