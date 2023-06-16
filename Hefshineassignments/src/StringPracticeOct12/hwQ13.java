package StringPracticeOct12;

public class hwQ13 {

	public static void main(String[] args) {
String s="abcdfe";
String s1="";
for (int i = 0; i < s.length(); i++)
{
     if(s.charAt(i)!='f')
    	 s1=s1+s.charAt(i);
}
System.out.println(s1);
	}

}
