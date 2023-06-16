package PracticeOct21;

public class removeEtraSpace {

	public static void main(String[] args) {
  String s="om            ka          r";
  int i=0;
  String s1="";
 String s2= removeSpace(s,s1,i);
  System.out.println(s2);
	}

	private static String removeSpace(String s, String s1,int i)
	{
           if(i<s.length())
           {
        	   if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
        		   //s1=s1+s.charAt(i);
           
        	 return  removeSpace(s,s1,i+1);
            
           else
           {
        	   s1=s1+s.charAt(i);
        	   return removeSpace(s,s1,i+1);
           }
         
       }
           return s1;
}

}
