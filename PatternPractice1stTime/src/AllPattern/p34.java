package AllPattern;

public class p34 {

	public static void main(String[] args) {
 int start=0;
 int diff=5;

for (int i = 0; i < 6; i++)
{    int counter=start;
	for (int j = 0; j < 6; j++)
	{
		if(j-i<=0)
			System.out.print((char)(counter+65));
		//counter++;
		counter=counter+diff;
		
		
	}
	start++;
	System.out.println();
}
	}

}
