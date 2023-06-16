package sundayOct10array;

public class additionofOuterele 
{

	public static void main(String[] args) 
	{
        int b[][]= {{1,2,3},
        		   {4,5,6},
        		  {1,2,3}};
        int sum=0;
        for (int i = 0; i < b.length; i++)
        {
			for (int j = 0; j < b[i].length; j++) 
			{
				if(j-i==0)
					sum=sum+b[i][j];	
			}
			
		}System.out.println(sum);
        		
        
	}

}
