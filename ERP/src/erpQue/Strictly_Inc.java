package erpQue;

public class Strictly_Inc {


	//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= 
			{
				5, 1, 3, 6, 8, 2, 9, 0, 10
			}
			;
			myCode(a);
		}
		//EndOfMainMethod
		private static void myCode(int[] a) 	
		{
			//WriteCode Here
			int incnum=0,decnum=0,inccnt=0,deccnt=0;
			if(a[0]>a[1])
			{
				incnum=a[1];
				inccnt++;
				decnum=a[0];
				deccnt++;
			}
			else
			{
				decnum=a[1];
				incnum=a[0];
				inccnt++;
				deccnt++;
			}
			for(int i=2;i<a.length;i++)
			{
				if(a[i]>incnum)
				{
					inccnt++;
					incnum=a[i];
				}
				else if(a[i]<decnum)
				{
					deccnt++;
					decnum=a[i];
				}
				else
				{
					System.out.print("-1 such a no sequence possible");
					System.exit(0);
				}
			}
			int inca[]=new int[inccnt];
			int deca[]=new int[deccnt];
			int index1=0,index2=0;
			incnum=0;
			decnum=0;
			if(a[0]>a[1])
			{
				deca[index2++]=a[0];
				inca[index1++]=a[1];
				incnum=a[1];
			}
			else if(a[0]<a[1])
			{
				deca[index2++]=a[1];
				inca[index1++]=a[0];
				incnum=a[0];
			}
			for (int i=2;i<a.length;i++)
			{
				if(a[i]>incnum)
				{
					incnum=a[i];
					inca[index1++]=a[i];
				}
				else 
				deca[index2++]=a[i];
			}
			for(int i=0;i<inca.length;i++)
			{
				System.out.print(inca[i]+" ");
			}
			for(int i=0;i<deca.length;i++)
			{
				System.out.print(deca[i]+" ");
			}
		}
	}
