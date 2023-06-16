package AllPattern;

public class Sushantp2 {

	public static void main(String[] args) {

for (int i = 0; i < 5; i++) 
{
	for (int j = 0; j < 5; j++) 
	{
		if(j==2 || i==2 || j==0 && i<=2 || i==4 && j<=2 || i==0&& j>=2 || j==4 && i>=2)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
