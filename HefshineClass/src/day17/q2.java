package day17;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]b= {{1,2,3},
				{4,5,6},
				{7,8,9}};

		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				if(i==0||i==2||j==0||j==2)
				
					System.out.print(b[i][j]+" ");
					else
						System.out.print("  ");
				
			}
			System.out.println();

		}

	}

}
