package day22String12Oct;

public class duplicateFindANdPrintDuplicateelement {

	public static void main(String[] args) {
 String s="abcdddabca";
 
 int count=0;
 
 for (int i = 0; i < s.length(); i++)
 {
	for (int j = i+1; j < s.length(); j++) 
	{
	    if(s.charAt(i)==s.charAt(j))
		{
	    count++;
	    // duplicate print 
	   System.out.println(s.charAt(i));
	    break;
	    }
	}
}
 System.out.println(count);
	}

}
