package Package1;

import java.util.Scanner;

public class Comp1 {
	
		static Scanner sc = new Scanner(System.in);
	
		public static void main(String args[]) {
	
			int test = sc.nextInt();
			while (test-- != 0) {
				int ntest = sc.nextInt();
				int row = 0;
				int bnst = 1;
				int nsh = 2 * ntest - 2;
				int anst = 1;
	
				while (row++ != ntest) {
	
					int bcst = 1;
					while (bcst <= bnst) {
						System.out.print("*");
						bcst++;
					}
	
					int csh = 1;
					while (csh <= nsh) {
						System.out.print("#");
						csh++;
					}
					int acst = 1;
					while (acst <= anst) {
						System.out.print("*");
						acst++;
					}
					System.out.println();
					bnst++;
					nsh -= 2;
					anst++;
	
				}
	
			}
		}
	}