package AllPattern;

public class sNAKE {

	public static void main(String[] args) {
		
		int cnt=1;
		for (int i = 0; i < 5; i++) 
		{int c=cnt;
			for (int j = 0; j < 5; j++) 
			{	
				if(j+i>=4)
				{
					if((j+1)%2==0)
				System.out.print(c++);
				}
				else
					System.out.print(" ");
			}
			cnt++;
			System.out.println();
			
		}
	}

}
