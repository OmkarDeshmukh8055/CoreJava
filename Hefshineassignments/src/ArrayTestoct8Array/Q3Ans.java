package ArrayTestoct8Array;

public class Q3Ans {

	public static void main(String[] args) {
int[] a= {1,5,7,6,4,3,2};

int temp=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++)
	{
		
		if(i<j && a[i]>a[j])
		{
			
			temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}	
}
	for (int j2 = 0; j2 < a.length; j2++)
	{
		System.out.println(a[j2]);
	}


	}
}
