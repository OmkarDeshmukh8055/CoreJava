package StringTestPracticeOct15;

public class hwQ19 {

	public static void main(String[] args) {
String s="aabbbcc";
 

int max=Integer.MIN_VALUE;
char maxchar=0;
    for (int i = 0; i < s.length(); i++) 
      { 
	 char ch= s.charAt(i);
    int count=0;
	 for (int j = 0; j < s.length(); j++) 
	 {
		if(ch==s.charAt(j))
			count++;
	 }
	 if(max<count)
	 {
		 max=count;
	 maxchar=ch;
	 }
	 
	 
		 
}System.out.println(maxchar+" "+max);
	}

}
