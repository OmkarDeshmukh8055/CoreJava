
public class LastIndexOf_Method {

	public static void main(String[] args) {
		String s1="krushananileshomkarsachinsurajnanamukul";
		String s2="";
		System.out.println(s1.lastIndexOf(s2));
		int re=myLastIndexOf(s1,s2);
		System.out.println(re);
	}
		private static int myLastIndexOf(String s1, String s2)
		{
			if(s2.length()==0)
				return s1.length();
		for(int i =s1.length()-1;i>=0; i--)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				int j=i,k=0,cnt=0;
				while(k<s2.length()&&j<s1.length())
				{
					if(s1.charAt(j)==s2.charAt(k))
						cnt++;
					else
						break;
					j++;k++;
				}
				if(s2.length()==cnt)
					return i;
			}
		}
		return -1;
		}

}
