package day23String13Oct;

public class Q28 {

	public static void main(String[] args) {
           String s="       abc   def    ghi    jkl   mno     ";
           int start=0;
           int end=s.length()-1;
           
         while(s.charAt(start)==' ')
        	 start++;
         while(s.charAt(end)==' ')
        	 end--;
         String s1="";
         int cnt=0;
         for (int i = start; i <= end; i++)
         {
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				cnt++;
			}		
			else
			{
				s1=s1+s.charAt(i);
			}
			
		}
         System.out.println(s1);
         
           
	}

}
