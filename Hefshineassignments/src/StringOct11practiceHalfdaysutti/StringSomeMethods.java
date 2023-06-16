package StringOct11practiceHalfdaysutti;

public class StringSomeMethods 
{

	public static void main(String[] args) 
	{
      String s="ABC def GHI jkl MNO";
		
      String p="pqr STUV WXYZ";
       
       //concat method
      String conCat=s.concat(p);
       System.out.println(conCat);
       
       //blank method
       System.out.println(s.isBlank());
       
       //empty method
       System.out.println(s.isEmpty());
       
       //indexof method
       String s1="abcdeCfgthiejk";
      int indexof=s1.indexOf("c");
      System.out.println(indexof);
      
      //lastindex
      int m=s1.lastIndexOf("e");
      System.out.println(m);
      
      //contains  it means in this availabe data identify
          boolean n=s1.contains("");
          System.out.println(n);
          
     //charAt it's display value
          int a=s1.charAt(3);
          System.out.println(a);
          
          //compareTo
          int c=s1.compareTo("c");
          System.out.println(c);
          //compareto with space avaialable String different answer
          int c1=s1.compareTo("c");
          System.out.println(c1);
         
          //compareToIgnore
          int c3=s1.compareToIgnoreCase("c");
          System.out.println(c3);
          //ccodeAt
          
          
       }

}
