
public class pattern {

	public static void main(String[] args) {
 int i=0;
 int j=0;
 mypattern(i,j);
	}

	private static void mypattern(int i, int j) {

		
		if(i<5)
		{
			if(j+i<5)
				System.out.print("*");
			else
				System.out.print(" ");
			
			if(j<4)
				j++;
			else if(j==4)
			{
				j=0;
			i++;
			System.out.println();
			}
			mypattern(i, j);
		}
		
	}

}
