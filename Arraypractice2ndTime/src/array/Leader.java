package array;

public class Leader {

	public static void main(String[] args) {

		int a[]= {1,9,2,3,4,6,4};
		
		for (int i = 0; i < a.length; i++) 
		{	int leader=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j]>a[i])
				{
					leader++;
				}
			}
				if(leader==0)
			
					System.out.println(a[i]);
					
		}
	}

}
