package mondayOct18;

public class Q1 {

	public static void main(String[] args) {
         
	int	i=0;
	print(i);
	}

	private static void print(int i) 
	{

		
		if(i<=9)
		{
			System.out.println("hi");
			i++;
			print(i);
		}
	}

}
