
public class Cnt {

	public static void main(String[] args) {
		String s="aaaabb";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			int d=0;
			for (int j = i+1; j <s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					d++;
					break;
				}
			}
			if(d>0)
			{
				System.out.println(s.charAt(i));
				cnt++;
			}
		}
		System.out.println("Dup cnt "+cnt);
	}

}
