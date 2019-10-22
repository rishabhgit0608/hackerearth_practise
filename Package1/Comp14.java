package Package1;

import java.util.*;

public class Comp14 {
		static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			int test = sc.nextInt();
			while (test-- != 0) {
				String str = sc.next();
				int n = Integer.valueOf(str);
				if (n % 21 == 0) {
					System.out.println("The Streak is broken");
				} else {
					boolean j = false;
					for (int i = 0; i < str.length(); i++) {
						if (i <= str.length() - 2) {
							if (str.charAt(i) == '2' && str.charAt(i + 1) == '1') {
								System.out.println("The streak is broken!");
								j = true;
								break;
							}
	
						}
	
					}
					if (!j) {
						System.out.println("The streak lives still in our heart!");
					}
				}
	
			}
	
		}
	
	}
