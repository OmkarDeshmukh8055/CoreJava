package StringPracticeOct12;

public class hwQ14 {

	public static void main(String[] args) {
String s="123j";
int j=0;
for ( ; j < s.length(); j++) 
{
	if(s.charAt(j)<='0' || s.charAt(j)>='9')
		break;
}
if(j==s.length())
	System.out.println("only digit");
else
	System.out.println("few charactors");

	}

}
