package array;

public class addofDiffSizeA {

	public static void main(String[] args) {
		int [][]s= {{1,2,3,1},
				{4,5,6,2},
				{7,8,9,3}};
		
		int [][]s1= {{11,12,13,1},
				{14,15,16,2},
				{17,18,19,3}};
			
		int a[][]=new int [s.length][s[0].length];
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++) 
			{
					a[i][j]=s[i][j]+s1[i][j];
			}
		}
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
