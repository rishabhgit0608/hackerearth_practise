package Package1;

import java.util.Scanner;

public class Comp6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = sc.nextInt();
		char arr[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
		while (test-- != 0) {
			int count = 0;
			String str = sc.next();
			for (char str1 : str.toCharArray()) {
				if (LinearSearch(arr , str1)) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

	private static boolean LinearSearch(char[] arr, char str1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(str1 == arr[i]) {
				return true;
			}
		}
		return false;
	}
}
// Instead of taking this into o(n2) you can take to o(n) as instead of Linear Searching you can Implement isVowel and use if else if	