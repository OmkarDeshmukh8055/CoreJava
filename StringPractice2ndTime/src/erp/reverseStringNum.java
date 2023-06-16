package erp;


	import java.util.Arrays;
	import java.util.Iterator;

	public class reverseStringNum{

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 = "43521";
			myCode(s1);
		}
		//EndOfMainMethod

		private static void myCode(String s1) 
		{
			//WriteCode Here
			char []ch=s1.toCharArray();
			String s="";
			for (int i = 0; i < ch.length; i++)
			{
				for (int j = i+1; j < ch.length; j++)
				{
					if(ch[i]>ch[j])
					{
						char t=ch[i];
						ch[i]=ch[j];
						ch[j]=t;
					}
				}
			}
			s=new String(ch);
			System.out.println(s);
			
		}
	}

