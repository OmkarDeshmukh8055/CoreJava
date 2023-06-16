package mondayOct18;

public class FINDmin {

	public static void main(String[] args) {
int  a[]= {11,2,12,14,13};

int min=Integer.MAX_VALUE;
int i=0;
minfind(a,i,min);


	}

	private static void minfind(int[] a, int i, int min) {
if(i<a.length)
{
	if(a[i]<min)
	{
		min=a[i];
		minfind(a,++i,min);

	}
	else
	{
		System.out.println(min);

	}
	
}
	}

}
