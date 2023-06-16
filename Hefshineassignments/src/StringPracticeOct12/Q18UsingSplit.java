package StringPracticeOct12;

public class Q18UsingSplit 
{

	public static void main(String[] args) 
	{
          String s= "abc def ghi jkl ";
          
          String []sa=s.split(" ");
          
         String s1="";
          for (int i = 0; i < sa.length; i++) 
       {
        	   s1=sa[i];
			for (int j = s1.length()-1; j>=0; j--) 
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
