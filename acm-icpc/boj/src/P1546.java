import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class P1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String[] str=br.readLine().split(" ");
		int sum=0;
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<count;i++) {
			ar.add(Integer.parseInt(str[i]));
			sum+=ar.get(i);
		}
		
		Collections.sort(ar);
		double avr=(double)sum/count;
		System.out.printf("%.2f", avr/ar.get(ar.size()-1)*100);
		
	}
//	public class Main {
//	    static int MAX_N = 1001;
//	    static int N;
//	    static double MAX;
//	    static int SUM;
//	    static int[] SCORE = new int[MAX_N];
//	    
//	    public static void main(String[] args) throws Exception{
//	        //System.setIn(new FileInputStream("input.txt"));
//	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	        N = Integer.parseInt(in.readLine());
//	        
//	        StringTokenizer st = new StringTokenizer(in.readLine());
//	        for(int idx = 0; idx < N; idx++) {
//	            SCORE[idx] = Integer.parseInt(st.nextToken());
//	            SUM += SCORE[idx];
//	            MAX = Math.max(MAX, SCORE[idx]);
//	        }
//	        System.out.printf("%.2f\n", (SUM * 100 / MAX / N));
//	    }
//	}

}
