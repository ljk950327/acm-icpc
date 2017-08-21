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

}
