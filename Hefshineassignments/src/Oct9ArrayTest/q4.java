package Oct9ArrayTest;

public class q4 
{

	public static void main(String[] args)
	{
      int a[]= {1,2,3,32,4,65,78,87,45};
      
	int evencount=0;
	for (int i = 0; i < a.length; i++)
	{
			if(a[i]%2==0)
			{
	        evencount++;
			}
		} 
		int[] even=new int[evencount];
		int []odd=new int [a.length-evencount];
		int p=0; int k=0;
		
		for (int j = 0; j < a.length; j++) 
		{
			if(a[j]%2==0)
			{
				even[p++]=a[j];
			}
			else
			{
				odd[k++]=a[j];
			}
				
		
	}
	System.out.println("even");
	for (int j2 = 0; j2< even.length; j2++)
	{
		System.out.println(even[j2]); 
	}
	System.out.println("odd");
	for (int j = 0; j < odd.length; j++) 
	{
		System.out.println(odd[j]);
		
	}
	
	}
}
