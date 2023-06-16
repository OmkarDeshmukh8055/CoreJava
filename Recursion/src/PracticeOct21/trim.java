package PracticeOct21;

public class trim {

	public static void main(String[] args) {
		String s="           Somu And Gomu        ";
		System.out.println(s);
		
		int i=0;
		int j=s.length()-1;
		i=findreali(s,i);
		j=findrealj(s,j);
		String s1="";
		
		String snew=takesubString(s,i,j,s1);
		System.out.println(snew);
	}
	private static String takesubString(String s, int i, int j, String s1) {
		
		  if(i<=j)
          {
        	 s1=s1+s.charAt(i); 
        	 return takesubString(s,i+1,j,s1);
          }
		  return s1;
	}
	private static int findrealj(String s, int j) {
        if(j>=0)
        {
        	if(s.charAt(j)==' ')
        		return findrealj(s,j-1);
        	return j;
        }
    	return j;
	}

	private static int findreali(String s, int i) {
            if(i<s.length())
            {
            	if(s.charAt(i)==' ')
            		return findreali(s,i+1);
            	return i;
            }
            return i;
	}


}
