package array;

public class max2 {

	public static void main(String[] args) {

		int a[]= {1,99,23,22,11};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;

		
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
		for (int i = 0; i < a.length; i++) 
		{
			if(max!=a[i])
			{
			if(max2<a[i])
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
