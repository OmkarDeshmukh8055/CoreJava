package day21String11ctStrat;

public class q14anotherWay {

	public static void main(String[] args) {
String s="12345";
int digitcount=0;
for (int i = 0; i < s.length(); i++)
{
 if(s.charAt(i)<'0' && s.charAt(i)>'9')	
	 digitcount++;
 
}
if(digitcount==s.length())
	System.out.println("only digit");
else
	System.out.println("few char");
	}

}
