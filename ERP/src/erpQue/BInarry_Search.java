package erpQue;

import java.util.Arrays;
import java.util.Iterator;
public class BInarry_Search 
{
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
		String ca[]=s1.split(" ");
		for(int i=0;i<ca.length;i++)
		{
			for(int j=i+1;j<ca.length;j++)
			{
				if(ca[i].length()>ca[j].length())
				{
					String t=ca[i];
					ca[i]=ca[j];
					ca[j]=t;
				}
			}
		}
		System.out.println("smallest word : "+ca[0]);
		System.out.println("largest word : "+ca[ca.length-1]);
	}
}
