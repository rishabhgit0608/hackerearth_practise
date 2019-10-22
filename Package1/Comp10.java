package Package1;

import java.util.*;

public class Comp10 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = s.nextInt();
		int narr[] = new int[n];
		for (int i = 0; i < n; i++) {
			narr[i] = s.nextInt();
		}
		int k = s.nextInt();
		Arrays.sort(narr);
		for (int i = 0; i < n; i++) {
			int l = narr[i];
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if(narr[j]== l) {
					count++;
				}
				else {
					break;
				}
			}
			if(count==k) {
				System.out.println(l);
				return;
			}
		}
	}

}
