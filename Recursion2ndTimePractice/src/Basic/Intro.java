package Basic;

public class Intro {

	public static void main(String[] args) {
	
		int a[]= {11,22,33,44,55,66,77};
		print(a,0);
	}

	private static void print(int[] a, int i)
	{
		if(i<a.length)
		{
			System.out.println(a[i]);
			print(a, i+1);
		}
		return;
	}

}
