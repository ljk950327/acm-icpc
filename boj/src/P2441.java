

import java.util.Scanner;

public class P2441 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			
			for(int j=num;j>0;j--) {
				if(num-i+1>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}

/*
 * 포문 두개 풀이
 * 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.valueOf(read.readLine());
        
		char[] k = new char[a];
		for(int i=0; i<a; i++){
			k[i] = '*';
		}
		for(int i=0; i<a; i++){
			System.out.println(k);
			k[i]=' ';
		}
	}
}
 * */

