

import java.util.Scanner;

public class P1924 {

	public static void main(String[] args) {
		int[][] cal = new int[13][32];
		int count=1;
		int num=31;
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		for(int i=1;i<=x;i++) {
			
			for(int j=1;j<=num;j++) {
				if(i==2) {
					num=28;
					cal[i][j]=count++;
				}else if(i==4||i==6||i==9||i==11) {
					num=30;
					cal[i][j]=count++;
				}else {
					num=31;
					cal[i][j]=count++;
				}
				if(i==x&&j==y) {
					break;
				}
			}
		}
		int day=cal[x][y]%7;
		switch (day) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;

		}
	}

}

/* ¾È±ÍÂúÀ»¶§, ¼Óµµ°¡ ºü¸§
 * public class Main {

    static int[] DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] DAYS_OF_WEEK = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    static int X;
    static int Y;
    static int DAYS;
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine().trim());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < X-1; i++) {
            DAYS += DAYS_OF_MONTH[i];
        }
        DAYS += Y -1;
        
        System.out.println(DAYS_OF_WEEK[DAYS%7]);
    }

}
 * 
 * */
