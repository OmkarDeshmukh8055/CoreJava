package array;

public class Q2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		int num=6;
		int i = 0;
	
		i= loopI(a,num,i);
		 if(i==a.length)
				System.out.println("not found");
			

	}

	private static int loopI(int[] a, int num, int i)
	{
		if(i<a.length)
		{
			if(a[i]==num)
			{
				System.out.println("found at index "+i);
				return i;
			}
			return loopI(a, num, i+1);
		}
		return i;
	}
}
