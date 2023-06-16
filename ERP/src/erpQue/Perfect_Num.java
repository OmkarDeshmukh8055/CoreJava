package erpQue;

public class Perfect_Num {
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int num=28;
			myCode(num);
		}
		//EndOfMainMethod
		private static void myCode(int num) 
		{
			//WriteCode Here
			int sum=0;
			int num1=num;
			int i=1;
				while(i<=num1/2)
			{
				if(num1%i==0)
				{
					sum=sum+i;
				}
				i++;
			}
			if(sum==num)
			System.out.print("perfect square");
			else
			System.out.print("not perfect square");
		}
	}


