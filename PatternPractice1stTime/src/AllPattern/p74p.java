package AllPattern;

public class p74p {

	public static void main(String[] args) {

for (int i = 0; i <5 ; i++) 
{    int cnt=0;
	for (int j = 0; j <9 ; j++)
	{  
		if(j+i>=4 && j-i<=4)
		{
			if(j<=4)
			{
				cnt++;
			}
			else
				cnt--;
		
		System.out.print((char)(cnt+64));
		}
		else
			System.out.print(" ");
	}
	System.out.println();
} 

	}

}
