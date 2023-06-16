
public class RemoveExtraSpace {

	public static void main(String[] args) {
		String s="krushna   suraj   nilesh rushi  sachin  om   muku  ";
			String s1="";
			s=s.trim();
			for (int i = 0; i <s.length(); i++)
			{
				if(s.charAt(i)==' '&& s.charAt(i+1)==' ')
				{
					
				}
				else
					s1=s1+s.charAt(i);
			}
			System.out.println(s1);
	}

}
