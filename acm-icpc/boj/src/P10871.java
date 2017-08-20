import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		sb.append(br.readLine());
		StringTokenizer st = new StringTokenizer(sb.toString());
		int count=Integer.parseInt(st.nextToken());
		int fn=Integer.parseInt(st.nextToken());
		int num=0;
		sb.delete(0, 2);
		while(count>0) {
			count--;
			if((num=Integer.parseInt(st.nextToken()))<fn) {
				sb.append(num);
				sb.append(" ");
			}
		}
		
		System.out.println(sb.toString());
	}

}

/**
 * import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.go();

	}
	
	public void go() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] parsedStr = br.readLine().split(" ");
		int num = Integer.parseInt(parsedStr[0]);
		int terms = Integer.parseInt(parsedStr[1]);
		
		String[] dataStrArr = br.readLine().split(" ");
		int[] dataArr = new int[dataStrArr.length];
		for (int i = 0 ; i < dataStrArr.length; i++) {
			dataArr[i] = Integer.parseInt(dataStrArr[i]);
		}
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < dataArr.length; i++) {
			if (dataArr[i] < terms) {
				result.append(dataArr[i] + " ");
			}
		}
		
		System.out.println(result.substring(0, result.length() - 1));
		
	}
	
	
}
*/
