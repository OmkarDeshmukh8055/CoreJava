package day5;

public class Hw20 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<10;j++)
			{
			//	if( j+i>4)
				if(j+i>=5&& j-i<=4 &&j-i>=-3&&j+i<=12)
					System.out.print(" ");
				else
					System.out.print("*");
	
}
			System.out.println();
	
	}
		/*for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 10; j++) 
			{
				if(j+i>4 && j-i<5 &&j-i>-4 &&j+i<13)
					System.out.print(" ");
			else
				System.out.print("*");
				
			}
			System.out.println();
		}*/


}
}
