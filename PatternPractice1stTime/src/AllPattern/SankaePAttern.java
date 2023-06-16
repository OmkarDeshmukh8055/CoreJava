package AllPattern;
import java.util.Iterator;
public class SankaePAttern {
	public static void main(String[] args) {
		int count=1;
for (int i = 0; i < 5; i++) 
{
	int jCount=count+i;
	for (int j = 0; j <5; j++)
	{
		if(j+i>=4)
			if(i%2==0)
				{
				System.out.print(count+" ");
				count++;
				}
			else
			{
				System.out.print(jCount--+" ");
				count++;
			}
		else
			System.out.print(" "); 
	}	
	System.out.println();
}
	}
}
