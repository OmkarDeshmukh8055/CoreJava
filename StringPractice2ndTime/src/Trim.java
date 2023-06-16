
public class Trim {

	static public  void main(String[] m) {
		String s1="          om          ";
	//	int leadingSpaceCount=0   l  ,traillingSpaceCount=0    t  ;
		int l=0,t=0;
		int i=0;
		while(s1.charAt(i)==' ')
		{
			l++;
			i++;
		}
		i=s1.length()-1;
		while(s1.charAt(i)==' ')
		{
			t++;
			i--;
		}
		System.out.println(l);
		System.out.println(t);

	}

}
