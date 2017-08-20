

import java.util.Scanner;
import java.util.StringTokenizer;

public class P10817 {
	static int Select(int a[], int left, int right, int order) {
		if (left == right)
			return left;

		int pivot = Partition(a, left, right);
		int k = pivot - left + 1;
		if (order == k)
			return pivot;
		else if (order < k)
			return Select(a, left, pivot - 1, order);
		else
			return Select(a, pivot + 1, right, order - k);
	}

		
	static int Partition(int a[], int left, int right)
	{
		int j = left;
		for (int i = left; i < right; i++)
		{
			if (a[i] < a[right])
				swap(a,i, j++);
		}
		swap(a,right, j);
		return j;
	}
	
	static void swap(int[] a,int i1,int i2 ) {
		int tmp=a[i1];
		a[i1]=a[i2];
		a[i2]=tmp;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int j = 0;

		int[] a = new int[3];

		while (sc.hasNextInt()) {
			a[j] = sc.nextInt();
			j++;
		}
		System.out.println(a[Select(a, 0, j, 2)]);
		
	}


//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(Integer.parseInt(st.nextToken()));
//		al.add(Integer.parseInt(st.nextToken()));
//		al.add(Integer.parseInt(st.nextToken()));
//		Collections.sort(al);
//		System.out.println(al.get(1));
//	}
}