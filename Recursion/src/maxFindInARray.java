
public class maxFindInARray {

	public static void main(String[] args) {
int a[]= {1,2,43,4,3};
int i=0;
int max=Integer.MIN_VALUE;
mymax(a,i,max);


int min=Integer.MAX_VALUE;
mymin(a,i,min);

	}
	
	private static void mymax(int[] a, int i, int max) 
	{
		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			mymax(a,i+1,max);
						
		}
		else
		{
			System.out.println(max);
		}
	
				
	}



	private static void mymin(int[] a, int i, int min) {

if(a.length>i)	
{
	if(a[i]<min)
		min=a[i];
	mymin(a,i+1,min);
}
else
{
	System.out.println(min);
	
}
	}

}
