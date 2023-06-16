package PracticeOct21;

public class indexOf {

	public static void main(String[] args) {
String s1="hiabcdehifghi";
String s2="ffhi";

if(s1.length()<s2.length())

	System.out.println(-1);
else
{
int result=indexof(s1,s2,0);
System.out.println(result);
}
System.out.println(s1.indexOf(s2));
	}

	private static int indexof(String s1, String s2, int i) {
         if(i<s1.length())
         {
        	 if(s1.charAt(i)==s2.charAt(0));
        	 {
        	 boolean index1=checkchar(s1,s2,i,0);
        	 if(index1==true)
        		 return i;
        	 else
        		 
        		return indexof(s1,s2,i+1);
        	 }
        	 }
		return -1;
	}

	private static boolean checkchar(String s1, String s2, int i, int j) {
          if(j<s2.length())
          {
        	  if(i<s1.length())
        	  {
        		  if(s1.charAt(i)==s2.charAt(j))
        			  return checkchar(s1,s2,i+1,j+1);
        		  return false;
          }
		return false;
          }
		return true;
	}

}
