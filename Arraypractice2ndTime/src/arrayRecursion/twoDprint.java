package arrayRecursion;

public class twoDprint {

	public static void main(String[] args) {

		int [][]s= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s.length; j++) 
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}

}
