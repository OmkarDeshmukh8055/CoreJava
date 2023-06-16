package array;

public class SaddlePoint {

	public static void main(String[] args) {

		int a[][]= {{1, 2,3},
				    {9, 7,8},
				    {2 ,4, 5}};
		boolean saddlepoint=true;
		for (int i = 0; i < a.length; i++) 
		{	
			for (int j = 0; j < a.length; j++)
			{	
				int smallrow=0;
				int largecol=0;
				
				for (int k = 0; k < a.length; k++)
				{
					for (int k2 = 0; k2 < a.length; k2++) 
					{
						if(i==k)
						{
							if(a[k][k2]<a[i][j])
							smallrow++;
						}
						else	if(j==k2)
						{
							if(a[k][k2]>a[i][j])
							largecol++;
						}
						
					}
				}
					if(smallrow==0 && largecol==0)
					{
						saddlepoint=false;
				        System.out.println(a[i][j]);
					}
			}
		}
		if(saddlepoint)
		{
			System.out.println("no saddle point");
		}
	}

}
