package day4;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint n=7;
		int count=0;
		int n=8;
		for( int i=2;i<n;i++)
		{
		if(n%i==0)
		count++;
				
		}
		if(count==0)
			System.out.println("prime");
		else
			System.out.println("non prime");
		}

}


