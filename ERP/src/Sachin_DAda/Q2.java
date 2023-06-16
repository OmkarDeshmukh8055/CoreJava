package Sachin_DAda;

import java.util.Iterator;

public class Q2 {
	
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= 
			{
				1,3,5,3,3,3,3,5,5
			}
			;
			myCode(a);
		}
		//EndOfMainMethod
		private static void myCode(int[] a) 
		{
			//WriteCode Here
			int cnt=0;
			for(int i=0 ; i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
						break;
					}
				}
			}
			System.out.println(cnt);
			int b[]=new int[a.length-cnt];
			int cc=0;
			for (int i = 0; i < b.length; i++) 
			{
				int c=0;
				for (int j = 0; j < b.length; j++) {
					if(a[i]==b[j])
						c++;
				}
				if(c==0)
					b[cc++]=a[i];
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
	}


