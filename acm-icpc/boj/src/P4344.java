import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			String caseStr[] = br.readLine().split(" ");
			int sum = 0;
			double avr=0;
			int student = Integer.parseInt(caseStr[0]);
			for (int j = 1; j <= student; j++) {
				sum += Integer.parseInt(caseStr[j]);
				
			}
			avr=(double)sum/student;
			int on=0;
			for (int j = 1; j <= student; j++) {
				if(Integer.parseInt(caseStr[j])>avr) {
					on++;
				}
				
			}
			
			sb.append(String.format("%.3f", (double)on/student*100)+"%\n");
            
		}
		System.out.println(sb.toString());
	}

}
