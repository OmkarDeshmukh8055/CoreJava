package StringPracticeOct13;

public class hwQ19 {

	public static void main(String[] args) {
 
		String s="aaacccddddddddddddeeeeeeeffffffffffffffff";
		int max=0;
		char maxChar=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
		     int count=0;
		     char ch=s.charAt(i);
		     
		     for (int j = 0; j < s.length(); j++) 
		     {
				if(ch==s.charAt(j))
					count++;
			}
		     if(max<count)
		     {
		    	 max=count;
		    	 maxChar=ch;
		     }
		}System.out.println(maxChar+" "+max);
		
	}

}
