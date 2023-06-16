package testOct19;



public class Q2 {

	public static void main(String[] args) {
  
		int [][]a= {{6,3,1},
		            {9,7,8},
	             	{2,4,5}};
		
		int smallinrow=0,largrincol=0;
		saddle(a,0,smallinrow,largrincol);
	
	}

	private static void saddle(int[][] a, int i, int smallinrow, int largrincol) {

          if(i<a.length)
          { 
        	 int j=i+1;
        	
        	  loopj(a,i,smallinrow,largrincol,j);
        	  
        	  saddle(a,i+1,smallinrow,largrincol);
        	
        	 
          }
	}

	private static void loopj(int[][] a, int i, int smallinrow, int largrincol,int j) {
           
		if(j<a.length)
		{
			if(a[i][j]<a[j][i])
			{
				smallinrow++;
				 
				 loopj(a,i,smallinrow,largrincol,j+1);
				  largrincol++;
			}
			if(smallinrow==0 && largrincol==0)
			 System.out.println(a[i]); 
		}
	}

}
