package erp;

	import java.util.Arrays;
	import java.util.Iterator;
	public class chipper_Num {

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 = "abcdXYZ";
			myCode(s1);
		}
		//EndOfMainMethod
		private static void myCode(String s1) 
		{
			//WriteCode Here
			s1=s1.toUpperCase();
			char ca[]=s1.toCharArray();
			for(int i=0;i<ca.length;i++)
			{
				char ch=ca[i];
				ch=(char)(155-ch);
				ca[i]=ch;
			}
			String s=new String(ca);
			System.out.println(s);
		}
	}

