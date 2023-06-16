package classOct20RecursionArrayAndString;

public class saddlePoint {

	public static void main(String[] args) {
           int [][]a= {{6,3,1},
        		       {9,7,8},
        		       {2,4,5}};
           int i=0; int j=0;
           checktwoMatrix(a,i,j);
           }

	private static void checktwoMatrix(int[][] a, int i, int j)
			 {
	        
		if(i<a.length)
		{
			boolean smallinrow=checkinrow(a,i,j,0);
			boolean largestinCol=checklargestinCol(a,i,j,0);
			if(smallinrow&& largestinCol)
			
				System.out.println(a[i][j]);
				if(j<a.length-1)
					j++;
				else
				{
					j=0; i++;
				}
			 checktwoMatrix(a,i,j);
		}
	}

	private static boolean checklargestinCol(int[][] a, int i, int j, int k) 
	{
		if(k<a.length)
		{
			if(a[k][j]>a[i][j])
				return false;
			else
				return checklargestinCol(a,i,j,k+1);	
		}
			
		return true;
	}

	private static boolean checkinrow(int[][] a, int i, int j, int k) 
	{   
		if(k<a.length)
		{
			if(a[i][k]<a[i][j])
				return false;
			else
				return checkinrow(a,i,j,k+1);	
		}
		
		return true;
	}

}
