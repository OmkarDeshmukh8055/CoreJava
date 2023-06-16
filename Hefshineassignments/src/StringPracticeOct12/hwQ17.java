package StringPracticeOct12;

public class hwQ17 {

	public static void main(String[] args) 
	{ 
        String s="aabbccddeef";  
        String s1="";
        int count=0;
       
        for (int i = 0; i < s.length(); i++)
        {
        	if(!s1.contains(""+s.charAt(i)))
        		s1=s1+s.charAt(i);
        	
        }
        System.out.println(s1);
			
        
	}

}
