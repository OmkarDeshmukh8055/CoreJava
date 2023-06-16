package sundayOct10array;

public class duplicateRemove 
{

	public static void main(String[] args) 
	{
		int a[]= {1111,2,2,2,2,2,23,3,3,3,4,5,55,6,7,7,7,6,75,7,8,8,8,8,8,8,4};
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				break;
				}
			}
		}
		//System.out.println(cnt);
		int b[]=new int[a.length-cnt];
		int k=0;
		
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
		   for (int j = 0; j < b.length; j++)
		   {
			   if(b[j]==a[i])
				   count++;
           }
		   if(count==0)
		   {
			   b[k]=a[i];
		   k++;
		   }
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
		
	}
	

}
