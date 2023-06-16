package day22String12Oct;

public class findMaxCharwithcount 
{

	public static void main(String[] args)
	{
          String s="aabbbbcc";
          int max=Integer.MIN_VALUE;
         
          //maxchar we can also declear 0 and alphabate
          char maxChar= 0;          
          for (int i = 0; i < s.length(); i++)
          {
        	  char ch=s.charAt(i);
        	  int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==ch)
					count++;
			}
			if(max<count)
			{
				max=count;
				maxChar=ch;
			}
		  }
          System.out.println(maxChar+" "+max);
	}

}
