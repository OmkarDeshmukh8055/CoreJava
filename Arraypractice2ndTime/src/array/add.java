package array;

public class add {

	public static void main(String[] args) {
		int [][]s= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		int [][]s1= {{11,12,13},
				{14,15,16},
				{17,18,19}};
			
		int a[][]=new int [s.length][s.length];
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s.length; j++) 
			{
					a[i][j]=s[i][j]+s1[i][j];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
