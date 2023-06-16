package classOct21RecursionInString;

public class SplitSpaceCOunt {

	public static void main(String[] args) {
          String s="Omakr Abasaheb Deshmukh";
         
          
          int i=0;
          int spacecount=0;
          spacecount=findspacecount(s,i,spacecount);
          int saindex=0;
          String s1="";
          String[] sa=new String[spacecount+1];
          fillpartindexArray(s,i,s1,saindex,sa);
          for(String ss:sa)
          {
        	  System.out.println(ss);
          }
         
          
          
	}

	

	private static void fillpartindexArray(String s, int i, String s1, int saindex, String[] sa) {
             if(i<s.length())
             {
            	 if(s.charAt(i)==' ')
            	 {
            		 sa[saindex++]=s1;
            		 s1="";
            		   fillpartindexArray(s,i+1,s1,saindex,sa); 
            	 }
            	 else
            	 {
            		 s1=s1+s.charAt(i);
            		 fillpartindexArray(s,i+1,s1,saindex,sa);
            	 }
             }
             else
             {
            	 sa[saindex]=s1;
             }
	}

	private static int findspacecount(String s, int i, int spacecount) {
                 if(i<s.length())
                 {
                	 if(s.charAt(i)==' ')
                		 spacecount++;
                	 return findspacecount(s,i+1,spacecount);
                 }
		return spacecount;
	}

}
