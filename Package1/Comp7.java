package Package1;

import java.util.*;

public class Comp7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nA = sc.nextInt();
		int Aarr[] = new int[nA];
		for (int i = 0; i < nA; i++) {
			Aarr[i] = sc.nextInt();
		}
		int nC = sc.nextInt();
		int Carr[] = new int[nC];
		for (int i = 0; i < nC; i++) {
			Carr[i] = sc.nextInt();
		}
		int i = 0;
		int j = 0;
		int[] Barr = new int[100];
		while (true) {
			int a = Carr[j] - Aarr[i];
			if (a != LinearSearch(Barr, a)) {
				Barr[i] = a;
				i++;
				j++;
				if (j == Carr.length) {
					Arrays.sort(Barr);
					for (int o : Barr) {
						if (o != 0) {
							System.out.print(o + " ");
						}
					}
					return;
				} else {
					j++;
					if (j == Carr.length) {
						Arrays.sort(Barr);
						for (int o : Barr) {
							if (o != 0) {

								System.out.print(o + " ");
							}
						}
						return;
					}

				}
			}
		}
	}

	private static int LinearSearch(int[] barr, int a) {

		// TODO Auto-generated method stub
		for (int i : barr) {
			if (a == i) {
				return a;
			}
		}
		return 0;
	}

}
