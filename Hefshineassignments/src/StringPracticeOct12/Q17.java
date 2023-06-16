package StringPracticeOct12;

public class Q17 {

	public static void main(String[] args) {
String s="abcdabcdabc";

int duPCnt=0;
         for (int i = 0; i < s.length(); i++)
            {
        	     char ch=s.charAt(i);
               for (int j = i+1; j < s.length(); j++)
               {
				   if(s.charAt(j)==ch)
				   {
					   duPCnt++;
					   System.out.print(ch);
					 
					   
				   }
				 
			   } 
               
            }  System.out.println();
         System.out.println(" "+duPCnt);
	}

}
