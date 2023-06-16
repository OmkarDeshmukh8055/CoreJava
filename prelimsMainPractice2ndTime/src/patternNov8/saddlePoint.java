package patternNov8;



public class saddlePoint {

	public static void main(String[] args) {
int [][]a= {{31,4,52},
		    {9,7,8},
		    {6,3,51}};
    
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++) 
	{
		int smallInrow=0;
		int largeIncol=0;
		
		for (int k = 0; k < a.length; k++)
		{
			for (int k2 = 0; k2 < a.length; k2++)
			{
				 if(k==i)
				 {
					 if(a[k][k2]<a[i][j])
						 smallInrow++;
				 }
					 if(k2==j)
					 {
						 if(a[k][k2]>a[i][j])
							 largeIncol++;
					 }
						
				 }
			}
		if(smallInrow==0 && largeIncol==0)
		System.out.println(a[i][j]);


		}
	}

	}

}
