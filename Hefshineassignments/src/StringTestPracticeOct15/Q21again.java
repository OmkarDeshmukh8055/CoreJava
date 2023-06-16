package StringTestPracticeOct15;

public class Q21again {
	
	public static void main(String[] args) {
    
		 String s="abcabcdabcdeabcabca";
		 
		 int sublen=Integer.MIN_VALUE;
		 int startindex=0;
		 
		 for (int i = 0; i < s.length(); i++) 
		 {     
			     String s1="";
			for (int j = i; j < s.length(); j++) 
			{
				 int  count=0;
				 
				 for (int k = 0; k < s1.length(); k++) 
				 {
					if(s.charAt(k)==s.charAt(j))
					{
						count++;
					}
				}
				 if(count==0)
					 s1=s1+s.charAt(j);
				 else
				 {
					 if(sublen<s1.length())
					 {
						 sublen=s1.length();
						 startindex=i;
					 }
						break; 
				 }
			}
		}
		 System.out.println(sublen);
		 System.out.println(startindex);
		 for (int i = startindex; i < startindex+sublen; i++)
		 {
			System.out.println(s.charAt(i));
		}
	
	}

}
