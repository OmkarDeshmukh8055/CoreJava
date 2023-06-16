package testPracticetillOct23;

import java.util.Iterator;

public class findmaxInmatrix {

	public static void main(String[] args) {
   int [][]a={ {1,2,3,4},
		   {5,6,7,8},
		   {9,0,11,23}};
   int max=Integer.MIN_VALUE;
   for (int i = 0; i < a.length; i++)
   {
	    for (int j = 0; j <= a.length; j++) 
	    {	
	  if(a[i][j]>max)
		  max=a[i][j];
	    }
   }System.out.println(max);
	}

}
