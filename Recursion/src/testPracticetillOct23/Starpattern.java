package testPracticetillOct23;



public class Starpattern {

	public static void main(String[] args) 
	{
		int i=0;
             loopi(i);
	}

	private static void loopi(int i) 
	{
		if(i<5)
		{
			int j=0;
			loop(i,j);
			System.out.println( );

			loopi(i+1);
		}

     		
	}

	private static void loop(int i, int j)
	{
		if(j<5)
		{
			if(j+i<=4)
				System.out.print("*");
			else
				System.out.print(" ");
			loop(i,j+1);
		}
		
	}

		}


