package zprePractice1;

public class Prime_Number_Series {

	public static void main(String[] args) {

		int start=2;
		int end=100;
		while(start<end)
		{	
			boolean prime=true;
			for (int i = 2; i <start; i++) 
			{
			if(start%i==0)
			{
				prime=false;
				break;
			}
			}
			if(prime)
				System.out.println("prime num "+start);
			start++;
		}
	}

}
