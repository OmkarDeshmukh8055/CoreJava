package array;

public class Q28Saddle {

	public static void main(String[] args) {
		int a[][]= {{6 ,3, 1},
			        {9 ,7, 8},
			        {2, 4, 5}};
		
			
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{	
					boolean smallinrow=true;
				for (int k = 0; k < a.length; k++) 
				{
						if (a[i][k] <a[i][j])

							smallinrow=false;						
		    	}
					boolean largeIncol=true;
					for (int k2 = 0; k2 < a.length; k2++)
					{	
					
						if (a[k2][j] >a[i][j])
							largeIncol=false;
					}
				
					if(smallinrow==true && largeIncol==true)
					{
						System.out.println(a[i][j]);
					}
			}
		}
	}

}
