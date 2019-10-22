package Package1;

import java.util.*;

public class one {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int test = sc.nextInt();

		while (test-- != 0) {

			int count = 0;

			int n = sc.nextInt();
			int k = sc.nextInt();
			char narr[][] = new char[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					narr[i][j] = sc.next().charAt(0);

				}
			}

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n; j++) {
					if (narr[i][j] == 'P') {
						if (j == 0) {
							int a = 0;
							int b = j + 1;
							while (a++ != k) {
								if (narr[i][b] == 'T') {
									count++;
									narr[i][b] = '\0';
									break;

								}
								b++;
							}
						} else if (j == n - 1) {
							int a = 0;
							int b = j - 1;
							while (a++ != k) {
								if (narr[i][b] == 'T') {
									count++;
									narr[i][b] = '\0';
									break;

								}
								b--;
							}
						} else {
							int a = 0;
							int b = j - 1;
							int b2 = j + 1;
							boolean flag = false;
							while (a++ != k) {
								if (narr[i][b] == 'T') {
									count++;
									narr[i][b] = '\0';
									break;
								}
								b--;
								if (b < 0) {
									break;
								}
							}

							int z = 0;
							while (z++ != k) {
								if (narr[i][b2] == 'T') {
									count++;
									narr[i][b2] = '\0';
									break;
								}
								b++;
								if (b > j - 1) {
									break;
								}

							}

						}

					}
				}
			}
			System.out.println(count);
		}

	}
}
