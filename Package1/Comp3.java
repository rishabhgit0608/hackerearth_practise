package Package1;

import java.util.Scanner;

public class Comp3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = sc.next();

	}

	public static void getsubstring(String str, int i) {
		
		if(str.length()==0) {
			return ;    
		}
		char a = str.charAt(0);
		String ros = str.substring(i, i + 1);
		getsubstring(ros, i);

	}

}
