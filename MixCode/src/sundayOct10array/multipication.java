package sundayOct10array;

public class multipication 
{

	public static void main(String[] args) 
	{
       int [][]a= {{1,2,3},
    		       {4,5,6},
    		      {7,8,9}};
       
       int[][]b= {{1,2},
    		      {3,4},
    		     {1,2}};

       int [][]c= new int[2][2];
       
       for (int i = 0; i < 2; i++) 
       {
		   
		   for (int j = 0; j < 2; j++)
		   {
			   for (int j2 = 0; j2 < 3; j2++)
			   {   
			c[i][j]= c[i][j]+a[i][j2]*b[j2][j];
			   }
		   }
	   }
        for (int i = 0; i < c.length; i++) 
        {
			for (int j = 0; j < b[i].length; j++) 
			{
			   System.out.print(c[i][j]+" "); 	
			}
			 System.out.println();
		}
       
	}
}
