

import java.util.Scanner;

public class P8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i =1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	/** 이런식으로 하면 빠름
	 *         if(t%2==1){
        	System.out.println((t+1) * (t/2) + (t+1)/2);
        }
        else{
        	System.out.println((t+1) * (t/2));
        }
	 */
}
