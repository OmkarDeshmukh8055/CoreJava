package Sachin_DAda;

public class Q3 {

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= 
			{
				1,2,3,4,5,6,7,8
			}
			;
			myCode(a);
		}
		//EndOfMainMethod
		private static void myCode(int[] a) 
		{
			//Write code here
			int j=a.length-1;
		for (int i = 0; i < a.length/2; i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		}
	}
