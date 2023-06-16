package array;

public class multiPlication {

	public static void main(String[] args) {
		int [][]s= {{1,2},
				    {2,2},
				    {4,5}};
		
		int [][]s1= {{1,2,3},
				     {7,8,3}};
			
		int a[][]=new int [s.length][s1[0].length];
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s.length; j++) 
			{	
				for (int k = 0; k < s[0].length; k++) 
				{
					a[i][j]=a[i][j]+s[i][k]*s1[k][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
