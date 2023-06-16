package StringPracticeOct14EndString;

public class hwQ14 {

	public static void main(String[] args) {
String s="asds123";
int j=0;
for (; j < s.length(); j++) 
{
	if(s.charAt(j)>='0' || s.charAt(j)<='9')
		break;
}
if(j==s.length())
	System.out.println("only digit");
else
	System.out.println("few char"); 
	}

}
