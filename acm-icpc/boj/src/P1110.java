import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num=br.readLine();
		int count=0;
		
		P1110 p = new P1110();
		System.out.println("count="+p.count(num,null, count));
		
	}
	
	public int count(String num,String nnum, int count) {
		count++;
		if(num.length()<2) {
			num=0+num;
		}
		if(nnum==null) {
			nnum=num;
		}
		char pnum=nnum.charAt(1);
		String sum=Integer.toString(nnum.charAt(0)-'0'+nnum.charAt(1)-'0');
		char psum=sum.charAt(sum.length()-1);
		nnum=Character.toString(pnum)+Character.toString(psum);
		System.out.println(nnum);
		if(nnum.equals(num)) {
			return count;
		}else {
			return count(num,nnum,count);
		}

	}

}
/**
 * public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine().trim());
		String target = cnt < 10 ? "0" + cnt : cnt + "";
		String use = target;
		int count = 1;
		while (true) {
			int a = use.charAt(0) - '0';
			int b = use.charAt(1) - '0';
			String temp = a + b < 10 ? 0 + "" + (a + b) : a + b + "";
			String result = b + "" + (temp.charAt(1) - '0');
			if (result.equals(target)) {
				break;
			}
			use = result;
			count++;
		}
		System.out.println(count);
	}// end main
 */
