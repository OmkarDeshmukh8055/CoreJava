package dec6;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		String []sa= {"12","mnopr","abcd","ab","pqr"};
		
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
					
			}
		}
			for (int j = 0; j < sa.length; j++)
			{
				System.out.println(sa[j]);
			}
		}
	

}
