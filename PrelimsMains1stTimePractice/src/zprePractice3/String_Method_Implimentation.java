package zprePractice3;

public class String_Method_Implimentation 
{
	public static void main(String[] args) 
	{
		String s="    a bcd         ";
		String s1="";
		
		int i=0;
		int j=s.length()-1;
				while(s.charAt(i)==' ')
				{
					i++;
				}
				
				while(s.charAt(j)==' ')
				{
					j--;
				}
				
				for (int k = i; k <i+j; k++) 
				{
					s1=s1+s.charAt(k);
				}
		System.out.println(s1);	
	}

}
