package testpracticeArray;

public class q15again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {12,21,34,156,7,89,98,89};

for (int i = 0; i < a.length; i++)
{
	int num=a[i];
	int greatcount=0;
	for (int j = i+1; j < a.length; j++) 
	{
			
	if(a[j]>num);
	greatcount++;
		
	}
if (greatcount==0)
	
	System.out.println(num);
}}
	
}