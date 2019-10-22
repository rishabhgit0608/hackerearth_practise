package Package1;

import java.util.Scanner;

public class Comp2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String encr = sc.next();
		int k = sc.nextInt();
		int l = k % 10;
		k = k % 26;
		StringBuilder deco = new StringBuilder();

		for (int i = 0; i < encr.length(); i++) {
			if (encr.charAt(i) >= 'A' && encr.charAt(i) <= 'Z' - k) {
				deco.append((char) (encr.charAt(i) + k));
			} else if (encr.charAt(i) >= 'a' && encr.charAt(i) <= 'z' - k) {
				deco.append((char)(encr.charAt(i) + k));

			} else if (encr.charAt(i) >= 48 && encr.charAt(i) <= 57 - l) {
				deco.append((char)(encr.charAt(i)+l));
			} else if (encr.charAt(i) > 'Z' - k && encr.charAt(i) <= 'Z') {
				int d = 90 - encr.charAt(i);
				int b = k - d;
				deco.append((char) (64 + b));
			} else if (encr.charAt(i) > 'z' - k && encr.charAt(i) <= 'z') {
				int d = 122 - encr.charAt(i);
				int b = k - d;
				deco.append((char) (96 + b));

			} else if (encr.charAt(i) > 57 - l && encr.charAt(i) <= 57) {
				int d = 57 - encr.charAt(i);
				int b = k - d;
				deco.append((char)(47 + b));

			} else {
				deco.append(encr.charAt(i));
			}

		}
		System.out.println(deco);
	}

}
