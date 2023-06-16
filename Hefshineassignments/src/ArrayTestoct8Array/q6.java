package ArrayTestoct8Array;

public class q6 
{

	public static void main(String[] args)
	{
		
int []a= {1,3,5,7,9};
int[]b= {0,2,4,6,8};

int[]c=new int[a.length+b.length];	

int count=0;

for (int i = 0; i < a.length; i++) 
	
{
	c[count++]=a[i];
}
	for (int j = 0; j < b.length; j++) 
	{
    c[count++]=b[j];
		
	}
	
for (int i = 0; i < c.length; i++) 
{
	System.out.print(c[i]+" ");
	
}
	
	}
}
