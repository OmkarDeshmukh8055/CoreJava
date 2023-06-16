package Oct9ArrayPractice;

public class evenOdd 
{

	public static void main(String[] args) 
	{
       int a[]= {1,2,34,56,7,65,3,43,23};
	
       int evencount=0;
	int []even=new int[a.length];
	int []odd=new int[a.length-evencount];
int	p=0;
int	k=0;
	for (int i = 0; i < odd.length; i++) 
	{
		if(a[i]%2==0)
			evencount++;
		
	
for (int j = 0; j < odd.length; j++) 
{
	if(a[i]%2==0)
		even[j++]=a[i];
		else
		{
			odd[k++]=a[i];
		}
}for (int k2 = 0; k2 < even.length; k2++) {
	
	
		System.out.println("even "+a[k2]);
}
}
	}}

