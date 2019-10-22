package Package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Comp5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<Integer>();
		Set<Integer> B = new HashSet<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			A.add(sc.nextInt());
		}

		int m = sc.nextInt();
		for (int j = 0; j < m; j++) {
			C.add(sc.nextInt());
		}

		for (int e = 1; e <= 100; e++) {
			boolean can_add = true;
			for (int i = 0; i < n; i++) {
				if (!iselementofC(e + A.get(i), C)) {
					can_add = false;
				}
			}
			if (can_add) {
				System.out.print(e + " ");
			}

		}
	}

	public static boolean iselementofC(int a, ArrayList<Integer> C) {
		for (int i = 0; i < C.size(); i++) {
			if (C.get(i) == a) {
				return true;
			}
		}
		return false;
	}

}