package erp;

public class interLeaving {
	
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			char[] a= {'a','b','c','d','e','f','g'};
			char[] b= {'w','x','y','z'};
			myCode(a,b);
		}
		//EndOfMainMethod

		private static void myCode(char[] a,char[] b) 
		{
			//WriteCode Here
			for (int i = 0; i < a.length+b.length; i++) 
			{
				if(i<a.length)
					System.out.print(a[i]+" ");
				if(i<b.length)
					System.out.print(b[i]+" ");
			}
		
		}
	}
