package StringTestPracticeOct15;

public class indexOfagain {
	static String s1="cde";
	static String s2="de";

	public static void main(String[] args) {
int s3=s1.indexOf(s2);
System.out.println(s3);
int s4=myindex();
System.out.println(s4);
	}

	private static int myindex() 
	{
		if(s1.length()<s2.length())
			return -1;
		
		for (int i = 0; i < s1.length(); i++) 
		{
		  	if(s1.charAt(i)==s2.charAt(0))
		  	{
		  		int s1index=i+1;
		  		int s2index=1;
		  		int count=1;

		  	
		  		while(s1index<s1.length() && s2index<s2.length())
		  		{   
		  			if(s1.charAt(s1index)==s2.charAt(s2index))
		  		
		 		  			count++;
		  			s1index++;
		  			s2index++;
		  	
		  		}
		  			if(count==s2.length())
		  				return i;
		  	}
		}
		return -1;
	
	}

}
