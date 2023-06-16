package classOct19;



public class multiplication {

	public static void main(String[] args)
	{
          int [][]a= {{1,2,3},
        		      {4,5,6}};
        		   
          
          int [][]b= {{1,2},
        		     {4,5},
        		     {7,8}};
          
          int [][]c=new int[a.length][a.length];
         
          loopi(a,b,c,0);
          }

	private static void loopi(int[][] a, int[][] b, int[][] c, int i) {
	
		  if(i<c.length)
		  {
			  
			  loopj(a,b,c,i,0);
			  System.out.println();
			  loopi(a,b,c,i+1);
		  }
		
	}

	private static void loopj(int[][] a, int[][] b, int[][] c, int i,int j) {
            
		if(j<c.length)
		{
	
		     loopk(a,b,c,i,j,0)	;
		     System.out.print(c[i][j]+" ");
		     loopj(a,b,c,i,j+1);  
		}
	}

	private static void loopk(int[][] a, int[][] b, int[][] c, int i, int j, int k) {
             
		if(k<b.length)
		{
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
			 loopk(a,b,c,i,j,k+1);
		}
	}

}
