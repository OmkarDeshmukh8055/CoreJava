package practiceArraytest;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]a= {{1,2,3},
		   {7,8,12},
		   {2,38,3}};

int smallinRow=0;
int largeinColumn=0;
for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length; j++)
	{
		int num=a[i][j];
		for (int k = 0; k < a.length; k++)
		{
			for (int k2 = 0; k2 < a.length; k2++) 
			{
				if(k==i)
				{
					if(a[k][k2]<num)
						smallinRow++;
					
					else if(k2==j)
					{
						if(a[k][k2]>num)
							largeinColumn++;
						
					}
					
						
				}
				
			} 
			if(smallinRow==0 && largeinColumn==0)
				System.out.println(a[i][j]); 
		}
	}
}
	}

}
