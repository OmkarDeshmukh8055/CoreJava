package erp;

import java.util.Arrays;
import java.util.Iterator;

public class lowest_And_Hights_String {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome to hefshine soft pvt ltd";
		myCode(s1);
	}
	//EndOfMainMethod

	private static void myCode(String s1) 
	{
		//WriteCode Here
		String sa[]=s1.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			for (int j =i+1; j < sa.length; j++)
			{
				if(sa[i].length()<sa[j].length())
				{
					String ss=sa[i];
					sa[i]=sa[j];
					sa[j]=ss;
				}
			}
		}
		System.out.println(sa[sa.length-1]);
		System.out.println(sa[0]);
		
	}
}
