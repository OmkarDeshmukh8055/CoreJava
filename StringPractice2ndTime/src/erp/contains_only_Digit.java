package erp;

public class contains_only_Digit {
	
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 ="1f23";
			myCode(s1);
		}
		//EndOfMainMethod

		private static void myCode(String s1) 
		{
			//write code here
			int c=0;
			for (int i = 0; i <s1.length(); i++)
			{
				if(s1.charAt(i)<'0' || s1.charAt(i)>'9')
					c++;
			}
			if(c==0)
				System.out.println("contains only ditgits");
			else
				System.out.println("not contains only ditgit");

		}
	}
