package dec6;

public class myLastIndexOf {

	public static void main(String[] args) {
		String s1="hbhjhkjhjjjom jhjhjjhjom";
		String s2="om";
		System.out.println(s1.lastIndexOf(s2));
		if(s2.length()<=s1.length())
		{	int index=-1;
			for (int i =s1.length()-s2.length();i>=0; i--)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subS="";
				for (int j = i; j <i+s2.length(); j++) 
				{
					subS=subS+s1.charAt(j);
				}
				if(subS.equals(s2))
				{
					index=i;
					break;
				}
				
			}
			}
			System.out.println(index);
		}
		else
			System.out.println(-1);
	}

}
