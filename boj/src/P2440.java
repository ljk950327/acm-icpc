

import java.util.Scanner;

public class P2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i>0; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
