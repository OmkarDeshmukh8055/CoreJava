package AllPattern;

public class dec11testP {

	public static void main(String[] args) {
		int cnt=0;
		int  start=0;
		for (int i = 0; i < 5; i++)
		{
			cnt=start;
			for (int j = 0; j < 5; j++)
			{	
			 
				if(j-i<=0)
				System.out.print(cnt);
				else
					System.out.print(" ");
				cnt=cnt+5;
			}
			start++;
			System.out.println();

		}
	}

}
