package erp;

public class Ends_Wit {
	//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 ="abcd";
			String s2 ="dc";		
			System.out.println("java method : "+s1.endsWith(s2));
			myCode(s1,s2);
		}
		//EndOfMainMethod
		private static void myCode(String s1,String s2) 
		{
			//write code here
			if(s2.length()==0)
			System.out.println("true");
			else
			{
				int  j=s1.length()-1,c=0;
				for(int i=s2.length()-1;i>=0;i--)
				{
					if(s1.charAt(j)!=s2.charAt(i))
					{
						c++;
System.err.println(false);
break;
					}
					j--;
				}
				if(c==0)
				System.out.println("true");
			}
		}
	}

