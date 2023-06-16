package day23String13Oct;

public class Q31 {

	public static void main(String[] args) 
	{
		//
  String s="abcdefg";
     s=s.toUpperCase();
     
     String s1="";
      for (int i = 0; i < s.length(); i++) 
	   {
         char ch=  s.charAt(i);
         int num=ch;
         num=155-num;
         char ch2=(char)num;
         s1=s1+ch2;
       }
      System.out.println(s1);
	}

}
