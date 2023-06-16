package AllPattern;

public class Q20 {

	public static void main(String[] args) {
		int cnt=1;
		for (int i = 0; i < 8; i=i+2) 
		{	
			for (int j = 0; j < 8; j++) 
			{
				if(j-i<=0)
				{
					if(i<=j*2)
					{
				System.out.print(cnt++);
					}
					else
						System.out.print(cnt--);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
