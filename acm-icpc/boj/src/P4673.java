

public class P4673 {
	public static int[] arr;
	public static int select(int num){
		int a,b,c,d;
		a=num/1000;
		b=num/100%10;
		c=num/10%10;
		d=num%10;
		int sum=a+b+c+d+num;
		return sum;
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		arr= new int[10001];
		for(int i=1;i<10001;i++){
			if(select(i)>10000){
				continue;
			}
			arr[select(i)]=select(i);
		}
		
		for(int i=1;i<10001;i++){
			if(arr[i]==0){
				sb.append(String.format("%d\n", i));
			}
		}
		System.out.println(sb.toString());
	}
}
