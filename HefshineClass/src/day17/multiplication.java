package day17;

public class multiplication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int [][]a= {{1,2,3},
		   {4,5,6}};
		int [][] b = {{1,2},
				       {4,5},
				       {7,8}};
		
		int[][]c=new int[2][2];
		for (int i = 0; i<2; i++) 
		{
			for (int j = 0; j <2; j++) 
			{
			for (int k = 0; k < 3; k++) {
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
			
		} for (int i = 0; i < c.length; i++) 
		{
			for(int j=0; j<b[i].length; j++) 
			{
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		}

	

}
