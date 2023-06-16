package ArrayPractice;

public class printAntiDigonalEle {

	public static void main(String[] args) {

int [][]a= {{1,2,3},
		    {3,4,5},
	     	{6,7,8}};

       for (int i = 0; i < a.length; i++) 
       {
		  for (int j = 0; j < a.length; j++) 
		  {
			if(j-i==0)
			
				System.out.print(a[i][j]+" ");
		}
	
	}
	}

}
