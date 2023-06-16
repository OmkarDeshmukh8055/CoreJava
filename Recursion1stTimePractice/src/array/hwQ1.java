package array;

public class hwQ1 {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6};
		int ele=3;
		
		loopI(0,ele,a);
	}

	private static void loopI(int i, int ele, int[] a) 
	{
		if(i<a.length)
		{
			if(a[i]==ele)
			{
				System.out.println("found at index "+i);
			}
			loopI(i+1, ele, a);
		}
	}

}
