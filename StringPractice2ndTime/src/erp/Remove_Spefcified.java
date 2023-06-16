package erp;

public class Remove_Spefcified {

	//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1="Aabcd";
				char ch='a';
				myCode(s1,ch);
			}
			//EndOfMainMethod

			private static void myCode(String s1,char ch) 
			{
				//WriteCode Here
				for (int i = 0; i < s1.length(); i++) {
					if(s1.charAt(i)!=ch)
						System.out.print(s1.charAt(i));
					
				}
			}
		}

