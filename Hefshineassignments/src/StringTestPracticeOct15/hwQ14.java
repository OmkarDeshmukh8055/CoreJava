package StringTestPracticeOct15;

public class hwQ14 {

	public static void main(String[] args) {
  String s="abcdefgh1";
  int count =0;
  for (int i = 0; i < s.length(); i++) 
  {
	char ch=s.charAt(i);
	if(ch>='0' && ch<='9' )
		count++;
  }
  if(count==0)
	  System.out.println("only digit");
  else
	  System.out.println("few char");
	}

}
