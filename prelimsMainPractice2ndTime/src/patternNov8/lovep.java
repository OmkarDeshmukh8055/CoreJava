package patternNov8;

public class lovep {

	public static void main(String[] args) {
		  for (int i = 0; i <5; i++)
	       {
			for (int j = 0; j <7 ; j++) 
			{
				if(j-i==-1|| j+i==7 || i==0 &&j!=0 && j!=3
						&& j!=6 || j==3 && i==1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
