package SundayArrayOct24;

public class avrageInnerele {

	public static void main(String[] args) {
     
		int a[][]= {{1,2,3,4},
				  {2,3,4,6},      
				  {2,3,5,6}};
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
			   if(i==0 || j==0 || i==a.length-1 || j==a[i].length)
			   {
				    }
			   else
			   {
				   sum=sum+a[i][j];
				   count++;
			  
			   }
			   }
			   
			
		}System.out.println(sum);
		System.out.println(sum/count);
  
	}

}
