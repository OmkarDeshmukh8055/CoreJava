package day24String14Oct;

public class indexOfnewWay 
{
         static String s1="abcdef";
         static String s2="";
         
	public static void main(String[] args)
	{
       int results=s1.indexOf(s2);  
       System.out.println(results);  
       
       int result1=myIndexOf();
       System.out.println(result1);
        		
	}

	private static int myIndexOf() 
	{
		if(s2.length()>s1.length())
		return -1;
		if(s2.isBlank())
			
    		return 0;
		for (int i = 0; i < s1.length(); i++) 
		{
		    if(s1.charAt(i)==s2.charAt(0))
		    {
		    	int index=0;
		    	int cnt=0;
		    	
		    	while(index < s2.length()&&index<s1.length())
		    	{
		    		if(s2.charAt(index)==s1.charAt(i+index))
		    			cnt++;
		    		index++;
		    	}
		    	if (cnt==s2.length())
		    	return i;
		    }
		    
		}
		return -1;
	}

}
