package AllPattern;

public class p112 {

	public static void main(String[] args) {

for (int i = 0; i < 5; i++) 
{
	for (int j = 0; j < 7; j++)
	{
		if(i==0 && j!=0 && j!=3 && j!=6 || i==1 && j==3 || j-i ==-1 || j+i==7 )
			System.out.print("*");
		else
			System.out.print(" ");
			
	}
	System.out.println();
}
	}

}
