package AllPattern;

import java.util.Iterator;

public class p73 {

	public static void main(String[] args) {
	
		for (int i = 0; i < 9; i=i+2) 
		{      int cnt=1;
			for (int j = 0; j <9; j++) 
			{
				if(j-i<=0)
				{
					   System.out.print((char)(cnt+64));

					if(j<i/2)
					
						cnt++;
					else
						cnt--;
					}
			
			}
			System.out.println();
		}
	}

}
