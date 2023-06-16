package practice;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {

String s="eD hs um hk";
String sa[]=s.split(" ");

	for (int i = 0; i < sa.length; i++) 
	{
			String s1=sa[i];
			char ca[]=s1.toCharArray();
			int a=0,b=ca.length-1;
			while(a<b)
			{
				char ch=ca[a];
				ca[a]=ca[b];
				ca[b]=ch;
				a++;b--;
			}
		String s3=new String (ca);
		sa[i]=s3;
	}
	System.out.println(Arrays.toString(sa));
//	sa=reverse(s,sa,0);
//	print(sa,0);
//	}
//
//	private static void print(String[] sa, int i)
//	{
//		if(i<sa.length)
//		{
//			System.out.print(sa[i]+" ");
//			print(sa, i+1);
//		}
//	}
//
//	private static String[] reverse(String s, String[] sa, int i)
//	{
//			if(i<sa.length)
//			{
//				String s1=sa[i];
//				char[] ca=s1.toCharArray();
//				int q=ca.length-1;
//				
//				ca=loopI(ca,q,0);
//				String s3=new String(ca);
//				sa[i]=s3;
//			return	reverse(s3, sa, i+1);
//			}
//		return sa;
//	}
//
//	private static char[] loopI(char[] ca, int q, int p) 
//	{
//		if(p<ca.length/2)
//		{
//			char temp=ca[p];
//			ca[p]=ca[q];
//			ca[q]=temp;
//			q--;
//			ca=loopI(ca, q, p+1);
//		}
//		return ca;
	}
}
