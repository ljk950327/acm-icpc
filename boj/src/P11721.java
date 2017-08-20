

import java.util.Scanner;

public class P11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<=str.length();i+=10) {
		if(i+10>str.length()) {
			sb.append(str.substring(i,str.length()));
		}else {
		sb.append(str.substring(i,i+10));
		sb.append('\n');
		}
		}

		System.out.println(sb.toString());
	}

	/** 조건문으로 검색하기
	 * 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String write = br.readLine();
		int writeLength = write.length()/10;
		
		if(writeLength != 0){
			for(int i=0;i<writeLength;i++){
					System.out.println(write.substring(i*10,(i+1)*10));
			}
		}
		System.out.print(write.substring(writeLength*10));
	}
	 */
}
