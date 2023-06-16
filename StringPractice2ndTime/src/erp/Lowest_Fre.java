package erp;

import java.util.Arrays;
import java.util.Iterator;

public class Lowest_Fre {
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "aabcccd";
		myCode(s1);
	}
	//EndOfMainMethod

	private static void myCode(String s1) 
	{
		char []ch=s1.toCharArray();
		char ca[]=new char[ch.length];
		int index=0;
		String s="";
		for (int i = 0; i <ch.length; i++)
		{
			int cnt=0;
			for (int j = i-1; j >=0; j--)
			{
				if(ch[i]==ca[j])
					cnt++;
			}
			if(cnt==0)
				ca[index++]=ch[i];
		}
		int a[]=new int [index];
		int aindex=0;
		for (int i = 0; i < index; i++) 
		{
			int cnt=0;
			for (int j = 0; j < ch.length; j++)
			{
				if(ch[j]==ca[i])
				{
					cnt++;
				}
			}
			a[aindex++]=cnt;
		}
		for (int i = 0; i <a.length; i++)
		{
			for (int j =i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
					
					char c=ca[i];
					ca[i]=ca[j];
					ca[j]=c;
				}
			}
		} 
		//System.out.println(ca[ca.length-2]);
		for (int i = 0; i <index; i++) {
			System.out.println(ca[i]+" "+a[i]);
		}
	}
}

