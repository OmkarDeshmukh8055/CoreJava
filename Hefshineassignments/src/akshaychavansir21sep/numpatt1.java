package akshaychavansir21sep;

public class numpatt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int count=0;
		
		for (int i =0; i < 5; i++)
		{
			
			for (int j = 0; j <5; j++) 
			{
				
				if (j-i<=0) 
					System.out.print(++count);
				 else 
					 System.out.print(" ");
				}
			System.out.println();
		}

	}

}
