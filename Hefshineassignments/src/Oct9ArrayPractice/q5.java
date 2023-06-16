package Oct9ArrayPractice;

public class q5
{

	public static void main(String[] args) 
	{
     int[]a= {1,1,1,1,1,2,2,3,4};
    int []b= {1,2,4};
     
     for (int i = 0; i < b.length; i++)
     {
		int num=b[i];
		int count=0;
		for (int j = 0; j < a.length; j++) 
		{
			if(a[j]==num)
			{
				count++;
			}
			if(count==2)
			{
				break;
			}
		}
		int []c=new int [a.length-count];
		int j2=0;
		int removecount=0;
		
		for (int k = 0; k < a.length; k++) 
		{
			if(a[k]!=num || removecount>=2)
			{
				c[j2++]=a[k];
			}
			else
			{
			 removecount++;	
			}
		}
		a=c;
	}
     for (int i = 0; i < a.length; i++) 
     {
		System.out.print(a[i]+ " ");
	}
	}

}
