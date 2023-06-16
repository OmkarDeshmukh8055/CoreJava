package StringTestPracticeOct16;

public class q1 {
	static String s="abcdeijfghij";
   static  String s1="ij";
     
    
	public static void main(String[] args) 
	{
		 int result2=mylastindex();
         System.out.println(result2);

	}
        private static int mylastindex()
        {
        	if(s.length()<s1.length())
       
        		return -1;
        
        	
        	for (int i =  s.length()-1;i>=0; i--)
        	{    
      
				int count=0;
        	        int  sindex=i;
        	       int  s1index=0;
		
        	       while(sindex<s.length()&&s1index<s1.length())
        	       {
					
				if(s.charAt(sindex)==s1.charAt(s1index))
				
					count++;
				sindex++;
				s1index++;
				
				
		
        	       }
        	       if(count==s1.length())
        	    	   return i;
					
				}
	        
        return -1;
        }
}
