package AllPattern;

public class p59 {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) 
		{ int counter=1;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i>=0 || j+i>=8)
					System.out.print(counter++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(2);
		System.out.println();
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if(j-i>=0)
					System.out.print(j-i+1);
				else if(j+i>=8)
					System.out.print(j+i-7);
				else
					System.out.print(" ");
				 
			}
			System.out.println();
		}
	}

}
