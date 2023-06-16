
public class Contanis_Method {

	public static void main(String[] args) {
		String s1="krushananileshomkarsachinsurajnanamukul";
		String s2="omar";
		System.out.println(s1.contains(s2));
		boolean re=contains(s1,s2);
		System.out.println(re);
	}
		private static boolean contains(String s1, String s2)
		{
			if(s2.length()==0)
				return true;
		for(int i = 0; i <s1.length(); i++)
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
					return true;
			}
		}
		return false;
		}

}
