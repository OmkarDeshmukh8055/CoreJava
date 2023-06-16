package StringPracticeOct13;

public class hwQ21 {

	public static void main(String[] args) {
String s="abcabcdabcdeabcaba";

int startindex=0;

int max=Integer.MIN_VALUE;
              for (int i = 0; i < s.length(); i++) 
              {String s1="";
            	  for (int j = i; j < s.length(); j++) 
            	  {
					char ch=s.charAt(j);
					int count=0;
					for (int k = 0; k < s1.length(); k++)
					{
						if(s1.charAt(k)==ch)
						{
							count++;
						}
					
					}
					if(count==0)
					{
						s1=s1+ch;
					}
					else
					{
						if(s1.length()>max)
						{
							max=s1.length();
							startindex=i;
						}
						break;
					}
					
				  }
              }
             System.out.println("max length "+max);
             System.out.println("startindex "+startindex);
             System.out.println("subString");
             
             for (int i = startindex; i <startindex+max; i++)
             {
				System.out.println(s.charAt(i));
			}
	}

}
