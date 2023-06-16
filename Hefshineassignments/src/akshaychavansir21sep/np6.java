package akshaychavansir21sep;

public class np6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < 9; i++)
		{
			int cnt=1;
			
			for (int j = 0; j <5; j++) 
			{
				if (j+i<=4)
				{
					System.out.print(cnt++);
		
				}
		 else if(j-i<=-4)
		 { 
			 System.out.print(cnt++);
					 System.out.print("");
				}
			}
			System.out.println();
		

	}

}}
