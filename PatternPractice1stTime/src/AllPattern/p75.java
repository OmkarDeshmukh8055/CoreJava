package AllPattern;

public class p75 {

	public static void main(String[] args) {
for (int i = 0; i < 13; i=i+2) 
{
	for (int j = 0; j < 13; j++) 
	{
		if(j-i<=0) 
		{
			if( j==i/2)
			System.out.print(" ");
			else
				System.out.print("*");
			
		}
	}
			System.out.println();
}
	}

}
