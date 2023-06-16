package startPattern;

public class whilelooppattern
{
	public static void main(String[] args) 
	{
		int i = 0;
		while (i < 4)
		{
			int j = 0;

			while (j < 4)
			{
				if (j - i <= 0)
					System.out.print("*");
				else
					System.out.print(' ');
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println("2");
		int i1=0;
		
		while(i1<9)
		{
			int j1=0;

			while(j1<5)
			{
				if(j1+i1<=4 || j1-i1<=-4)
				
					System.out.print("*");
					else
						System.out.print(" ");
				j1++;	
			}
			i1++;
			System.out.println();
		}
		
		System.out.println("3");
		int ii=0;
		
		while(ii<9)
		{
			int jj=0;

			while(jj<5)
			{
				if(jj+ii>=4 && jj-ii>=-4)
				
					System.out.print("*");
					else
						System.out.print(" ");
				jj++;	
			}
			ii++;
			System.out.println();
		}

	}

}
